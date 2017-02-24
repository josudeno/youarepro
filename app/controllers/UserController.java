package controllers;

import com.avaje.ebean.Model;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.db.Database;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

import static play.libs.Json.toJson;

public class UserController extends Controller
{
    @Inject
    FormFactory formFactory;

    private Database db;

    @Inject
    public UserController(Database db) {
        this.db = db;
    }

    public Result index() throws SQLException {
        return ok(views.html.user.render("user"));
    }

    public Result list() {
        Model.Finder<Integer, User> finder = new Model.Finder<>(User.class);
        List<User> users = finder.all();
        return ok(toJson(users));
    }

    public Result signup() {
        Form<User> userForm = formFactory.form(User.class);
        User user = userForm.bindFromRequest().get();
        user.save();
        if (userForm.hasErrors()) {
            return badRequest(views.html.user.render("eerrrs"));
        }
        return redirect(routes.UserController.index());
    }

}


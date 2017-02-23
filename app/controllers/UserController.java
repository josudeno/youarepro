package controllers;

import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class UserController extends Controller
{
    @Inject
    FormFactory formFactory;

    public Result index() {
        return ok(views.html.user.render("user"));
    }

    public Result signup() {
        Form<User> userForm = formFactory.form(User.class);
        User user = userForm.bindFromRequest().get();
        user.save();
        return ok("user signed up");
    }
}

package controllers;

import com.avaje.ebean.Model;
import models.Product;
import play.data.Form;
import play.data.FormFactory;
import play.db.Database;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

import static play.libs.Json.toJson;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Inject
    private FormFactory formFactory;

    private Database db;

    @Inject
    public HomeController(Database db) {
        this.db = db;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Index"));
    }

    public Result addProduct() {
        Form<Product> userForm = formFactory.form(Product.class);
        Product product = userForm.bindFromRequest().get();
        product.save();
        //return ok("Product: " + product.name); // DEBUG
        return redirect(routes.HomeController.index());
    }

    public Result getProducts() {
        Model.Finder<Integer, Product> finder = new Model.Finder<>(Product.class);
        List<Product> products = finder.all();
        return ok(toJson(products));
    }

    public Result search() throws SQLException {
        Model.Finder<Integer, Product> finder = new Model.Finder<>(Product.class);
        String search = request().getQueryString("product");
        List<Product> products = finder.where().ilike("name", search).findList();

        return ok(Json.toJson(products));

    }
}

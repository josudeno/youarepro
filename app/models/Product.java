package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Indy on 27-3-2016.
 */
@Entity
public class Product extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Integer id;

    public String name;

    private String description;

    public Product() {}

    public Product(String name) {
        this.name = name;
    }
}

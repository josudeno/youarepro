package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User extends Model
{
    @Constraints.Required
    private String name;

    @Constraints.Required
    @Column(unique = true)
    @Constraints.Email
    @NotNull
    private String email;

    @Constraints.Required
    private String password;

    @Id
    private String uid;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}

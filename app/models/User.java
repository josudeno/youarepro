package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String uid;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

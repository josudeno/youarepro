package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person extends Model
{
    @Id
    Integer pid;
    @Constraints.Required
    String name;
    @Constraints.Required
    String surname;

    Date dob;
    String gender;
}

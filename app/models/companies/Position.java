package models.companies;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Position extends Model
{
    @Id
    Integer pid;

    @OneToMany(mappedBy = "Job")
    @JoinColumn(name="job", referencedColumnName = "jid")
    Job job;

    String name;

    String description;

    Float salary;

    @Constraints.Required
    @NotNull
    Date dateOpen;

    @Constraints.Required
    @NotNull
    Date dateClosed;
}

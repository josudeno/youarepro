package models.companies;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Job extends Model
{
    @Id
    Integer jid;

    @Constraints.Required
    String name;
    String description;

    @OneToMany(mappedBy = "Company")
    @JoinColumn(name="company", referencedColumnName = "cid")
    Company company;

}

package models.companies;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company extends Model
{
    @Id
    Integer cid;

    String name;
    String description;

}

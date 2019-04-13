package kg.infoservice.mngclass.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roleid")
    public int id;

    @Column(name = "role_name")
    public String name;

    public int active;
}

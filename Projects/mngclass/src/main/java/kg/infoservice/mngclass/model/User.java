package kg.infoservice.mngclass.model;

import lombok.Data;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "email")
    @Email(message = "Введите почтовый адрес")
    @NotEmpty(message = "Необходимо ввести почтовый адрес")
    private String email;

    @Column(name = "pwd")
    @NotEmpty(message = "Необходимо ввести пароль")
    private String password;

    @Column(name = "user_name")
    @NotEmpty(message = "Необходимо ввести ФИО")
    private String name;

    private int active;

    /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "userid"),inverseJoinColumns = @JoinColumn(name = "roleid"))
    private Set<Role> roles;*/


    @ManyToOne
    @JoinColumn(name = "roleid")
    private Role role;
}

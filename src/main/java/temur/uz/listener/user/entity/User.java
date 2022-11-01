package temur.uz.listener.user.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

//@Data
//@Entity
//@Table(name = "users")
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Email is mandatory")
    private String email;
}

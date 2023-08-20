package com.Loginform.EntityModel;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Registerdatatable")
public class Registerationformdata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotEmpty

    @Column(name="email")
    @Email(message = "enter valid email id")
    private String email;
    @NotEmpty
    @Size(min=6, message="minium later should be four")
    private String psw;
    @Size(min=6, message="minium later should be four")
    private String pswrepeat;
}

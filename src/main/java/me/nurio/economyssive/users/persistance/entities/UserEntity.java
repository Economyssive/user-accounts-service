package me.nurio.economyssive.users.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "users", indexes = {@Index(columnList = "email,username")})
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false) private String name;
    @Column(nullable = false) private String email;

    @Column(nullable = false) private String password;
    @Column(nullable = false) private String salt;

}
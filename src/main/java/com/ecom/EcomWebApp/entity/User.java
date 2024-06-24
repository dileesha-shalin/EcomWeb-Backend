package com.ecom.EcomWebApp.entity;

import com.ecom.EcomWebApp.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;
    private String password;
    private String name;
    private UserRole userRole;
    //dfdfdfdfdf

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;
}

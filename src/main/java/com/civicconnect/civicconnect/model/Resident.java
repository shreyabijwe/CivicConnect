package com.civicconnect.civicconnect.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "resident")
@Data
public class Resident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String phone;

    private String password;

    private String locality;

    private String pincode;
}
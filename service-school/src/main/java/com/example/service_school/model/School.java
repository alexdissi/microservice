package com.example.service_school.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
}

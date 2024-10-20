package org.example.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "population")
    private int population;

    @Column(name = "is_subway")
    private Boolean is_subway;
}

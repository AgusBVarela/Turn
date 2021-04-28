package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="pacients")

public class Pacient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPacient;
    private String name;
    private String lastName;
    private String address;
    private int dni;
    private LocalDate birthDate;
    private String phone;
    private String mail;
    @OneToMany(mappedBy = "pacient")
    private Set<Turn> turns;
}

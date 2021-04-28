package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="dentists")
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDentist;
    private String name;
    private String lastName;
    private String address;
    private int dni;
    private LocalDate birthDate;
    private String phone;
    private String mail;
    private String code;
    @OneToMany(mappedBy = "dentist")
    private List<Diary> diaries;
}

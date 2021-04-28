package com.example.demo.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="turn_status")

public class TurnStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idStatus;
    private  String name;
    private String description;

   @OneToOne
    @JoinColumn(name="idTurn")
    private Turn turn;


}

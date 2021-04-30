package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
public class Turn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTurn;

    @ManyToOne
    @JoinColumn(name="id_pacient", nullable = false)
    private Pacient pacient;

    @ManyToOne
    @JoinColumn(name="id_dentist", nullable = false)
    private Dentist dentist;

}

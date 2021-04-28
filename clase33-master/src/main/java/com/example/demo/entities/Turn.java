package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="turns")

public class Turn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPTurn;
    @ManyToOne
    @JoinColumn(name="idDiary")
    private Diary diary;

    @OneToOne
    @JoinColumn(name="idStatus")
    private TurnStatus turnStatus;

    @ManyToOne
    @JoinColumn(name="idPacient")
    private Pacient pacient;
}

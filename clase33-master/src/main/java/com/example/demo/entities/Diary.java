package com.example.demo.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity

@Table(name="diaries")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDiary;
    private LocalDate startTime;
    private LocalDate endTime;
    @OneToMany(mappedBy = "diary")
    private List<Turn> turns;
    @ManyToOne
    @JoinColumn(name="idDentist")
    private Dentist dentist;

}

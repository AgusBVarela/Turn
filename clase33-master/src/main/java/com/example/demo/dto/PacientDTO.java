package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacientDTO {
    private int idPacient;
    private String name;
    private String lastName;
    private int dni;
}

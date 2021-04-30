package com.example.demo.dto;

import com.example.demo.entities.Pacient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurnDTO {
    private PacientDTO pacient;
    private DentistDTO dentist;
}

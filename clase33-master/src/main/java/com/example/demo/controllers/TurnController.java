package com.example.demo.controllers;

import com.example.demo.entities.Turn;
import com.example.demo.services.TurnService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TurnController {

    TurnService service;

    public TurnController(TurnService service) {
        this.service = service;
    }

    @GetMapping("/turns")
    public List<Turn> getAll(){
        return this.service.getAll();
    }

    @PostMapping("/setTurn")
    public void setTurn(@RequestBody TurnDTO turn){
        this.service.setTurn(turn);
    }

    @PutMapping("/uploadTurn")
    public void updateTurn(@RequestBody Turn turn){
        this.service.updateTurn(turn);
    }

    @DeleteMapping("/deleteTurn/{id}")
    public void deleteTurn(@PathVariable int id){
        this.service.deleteTurn(id);
    }

}

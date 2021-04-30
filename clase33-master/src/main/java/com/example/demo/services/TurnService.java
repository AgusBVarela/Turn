package com.example.demo.services;

import com.example.demo.dto.TurnDTO;
import com.example.demo.entities.Turn;
import com.example.demo.repositories.ITurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TurnService implements ITurnService{

    private ITurnRepository turnRepository;

    public TurnService(ITurnRepository turnRepository) {
        this.turnRepository = turnRepository;
    }

    public List<Turn> getAll(){
        return this.turnRepository.findAll();
    }

    public void setTurn(TurnDTO turn){
        Turn turn
        this.turnRepository.save(turn);
    }

    public void updateTurn(Turn turn){
        this.turnRepository.save(turn);
    }

    public void deleteTurn(int id){
        this.turnRepository.deleteById(id);
    }

}

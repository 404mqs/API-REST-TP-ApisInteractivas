package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Edificio;
import com.example.demo.repositories.EdificioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    @Autowired
    EdificioRepository edificioRepository;
    
    public ArrayList<Edificio> obtenerEdificios(){
        return (ArrayList<Edificio>) edificioRepository.findAll();
    }

    public Edificio guardarEdificio(Edificio usuario){
        return edificioRepository.save(usuario);
    }

    public Optional<Edificio> obtenerPorId(Long id){
        return edificioRepository.findById(id);
    }


    public boolean eliminarEdificio(Long id) {
        try{
        	edificioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
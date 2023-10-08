package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Edificio;
import com.example.demo.models.Reclamo;
import com.example.demo.repositories.EdificioRepository;
import com.example.demo.repositories.ReclamoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclamoService {
    @Autowired
    ReclamoRepository reclamoRepository;
    
    public ArrayList<Reclamo> obtenerReclamos(){
        return (ArrayList<Reclamo>) reclamoRepository.findAll();
    }

    public Reclamo guardarReclamo(Reclamo usuario){
        return reclamoRepository.save(usuario);
    }

    public Optional<Reclamo> obtenerPorId(Long id){
        return reclamoRepository.findById(id);
    }

    public boolean eliminarReclamo(Long id) {
        try{
        	reclamoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
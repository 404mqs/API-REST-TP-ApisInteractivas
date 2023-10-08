package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Edificio;
import com.example.demo.models.Reclamo;
import com.example.demo.models.RespuestaReclamo;
import com.example.demo.repositories.EdificioRepository;
import com.example.demo.repositories.ReclamoRepository;
import com.example.demo.repositories.RespuestaReclamoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaReclamoService {
    @Autowired
    RespuestaReclamoRepository respuestareclamoRepository;
    
    public ArrayList<RespuestaReclamo> obtenerRespuestaReclamos(){
        return (ArrayList<RespuestaReclamo>) respuestareclamoRepository.findAll();
    }

    public RespuestaReclamo guardarRespuesta(RespuestaReclamo usuario){
        return respuestareclamoRepository.save(usuario);
    }

    public Optional<RespuestaReclamo> obtenerPorId(Long id){
        return respuestareclamoRepository.findById(id);
    }

    public boolean eliminarReclamo(Long id) {
        try{
        	respuestareclamoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.EspacioComun;
import com.example.demo.repositories.EspacioComunRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspacioComunService {
    @Autowired
    EspacioComunRepository espacioComunRepository;
    
    public ArrayList<EspacioComun> obtenerEdificios(){
        return (ArrayList<EspacioComun>) espacioComunRepository.findAll();
    }

    public EspacioComun guardarEdificio(EspacioComun usuario){
        return espacioComunRepository.save(usuario);
    }

    public Optional<EspacioComun> obtenerPorId(Long id){
        return espacioComunRepository.findById(id);
    }


    public boolean eliminarEspacioComun(Long id) {
        try{
        	espacioComunRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
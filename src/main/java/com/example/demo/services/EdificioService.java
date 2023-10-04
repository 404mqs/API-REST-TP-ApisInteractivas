package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.EdificioModel;
import com.example.demo.repositories.EdificioRepository;

@Service
public class EdificioService {
	@Autowired
	EdificioRepository edificioRepository;
	
	 public ArrayList<EdificioModel> obtenerEdificios(){
	        return (ArrayList<EdificioModel>) edificioRepository.findAll();
	    }
	
	 public EdificioModel guardarEdificio(EdificioModel edificio){
	        return edificioRepository.save(edificio);
	    }

	    public Optional<EdificioModel> obtenerPorId(Long id){
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

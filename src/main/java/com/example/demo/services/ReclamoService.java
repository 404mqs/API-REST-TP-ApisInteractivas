package com.example.demo.services;

import java.util.ArrayList; import java.util.Optional;

import com.example.demo.models.ReclamoModel; 
import com.example.demo.repositories.ReclamoRepository;

import org.springframework.beans.factory.annotation.Autowired; import org.springframework.stereotype.Service;

@Service 
public class ReclamoService { 
	
	@Autowired 
	ReclamoRepository reclamoRepository;

	public ArrayList<ReclamoModel> obtenerReclamos(){
		return (ArrayList<ReclamoModel>) reclamoRepository.findAll();
	}

	public ReclamoModel guardarReclamo(ReclamoModel reclamo){
		return reclamoRepository.save(reclamo);
	}

	public Optional<ReclamoModel> obtenerPorId(Long id){
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
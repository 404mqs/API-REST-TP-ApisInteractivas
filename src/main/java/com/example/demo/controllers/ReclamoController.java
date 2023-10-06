package com.example.demo.controllers;

import java.util.ArrayList; 
import java.util.Optional;

import com.example.demo.models.ReclamoModel; 
import com.example.demo.services.ReclamoService;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*;

@RestController 
@RequestMapping("/reclamo") 
public class ReclamoController { 
	@Autowired 
	ReclamoService reclamoService;

	@GetMapping()
	public ArrayList<ReclamoModel> obtenerReclamos(){
		return reclamoService.obtenerReclamos();
	}

	@PostMapping()
	public ReclamoModel guardarReclamo(@RequestBody ReclamoModel reclamo){
		return this.reclamoService.guardarReclamo(reclamo);
	}

	@GetMapping( path = "/{id}")
	public Optional<ReclamoModel> obtenerReclamoPorId(@PathVariable("id") Long id) {
		return this.reclamoService.obtenerPorId(id);
	}

	/*
	@GetMapping("/query")
	public ArrayList<ReclamoModel> obtenerReclamoPorPrioridad(@RequestParam("prioridad") Integer prioridad){
    	return this.reclamoService.obtenerPorPrioridad(prioridad);
	}*/

	@DeleteMapping( path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id){
		boolean ok = this.reclamoService.eliminarReclamo(id);
		if (ok){
			return "Se eliminó el reclamo con id " + id;
		}else{
        return "No pudo eliminar el reclamo con id" + id;
		}
	}
}
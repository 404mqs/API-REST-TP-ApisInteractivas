package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Edificio;
import com.example.demo.models.Reclamo;
import com.example.demo.services.EdificioService;
import com.example.demo.services.ReclamoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reclamo")
public class ReclamoController {
    @Autowired
    ReclamoService reclamoService;

    @GetMapping()
    public ArrayList<Reclamo> obtenerReclamos(){
        return reclamoService.obtenerReclamos();
    }

    @PostMapping()
    public Reclamo guardarReclamo(@RequestBody Reclamo reclamo){
        return this.reclamoService.guardarReclamo(reclamo);
    }

    @GetMapping( path = "/{id}")
    public Optional<Reclamo> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.reclamoService.obtenerPorId(id);
    }

    /*
    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }*/

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.reclamoService.eliminarReclamo(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}
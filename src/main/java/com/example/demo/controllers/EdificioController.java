package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Edificio;
import com.example.demo.services.EdificioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/edificio")
public class EdificioController {
    @Autowired
    EdificioService edificioService;

    @GetMapping()
    public ArrayList<Edificio> obtenerEdificios(){
        return edificioService.obtenerEdificios();
    }

    @PostMapping()
    public Edificio guardarEdificio(@RequestBody Edificio edificio){
        return this.edificioService.guardarEdificio(edificio);
    }

    @GetMapping( path = "/{id}")
    public Optional<Edificio> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.edificioService.obtenerPorId(id);
    }

    /*
    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }*/

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.edificioService.eliminarEdificio(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}
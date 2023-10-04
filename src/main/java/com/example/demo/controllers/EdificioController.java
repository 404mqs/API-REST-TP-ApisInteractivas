package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.EdificioModel;
import com.example.demo.services.EdificioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/edificio")
public class EdificioController {
    @Autowired
    EdificioService edificioService;

    @GetMapping()
    public ArrayList<EdificioModel> obtenerEdificios(){
        return edificioService.obtenerEdificios();
    }

    @PostMapping()
    public EdificioModel guardarEdificio(@RequestBody EdificioModel edificio){
        return this.edificioService.guardarEdificio(edificio);
    }

    @GetMapping( path = "/{id}")
    public Optional<EdificioModel> obtenerEdificioPorId(@PathVariable("id") Long id) {
        return this.edificioService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.edificioService.eliminarEdificio(id);
        if (ok){
            return "Se eliminó el edificio con id " + id;
        }else{
            return "No se pudo eliminar el edificio con id " + id;
        }
    }
}
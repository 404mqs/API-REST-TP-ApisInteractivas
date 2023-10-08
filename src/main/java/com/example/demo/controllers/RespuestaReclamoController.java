package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Edificio;
import com.example.demo.models.Reclamo;
import com.example.demo.models.RespuestaReclamo;
import com.example.demo.services.EdificioService;
import com.example.demo.services.ReclamoService;
import com.example.demo.services.RespuestaReclamoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/respuestareclamo")
public class RespuestaReclamoController {
    @Autowired
    RespuestaReclamoService respuestareclamoService;

    @GetMapping()
    public ArrayList<RespuestaReclamo> obtenerRespuestas(){
        return respuestareclamoService.obtenerRespuestaReclamos();
    }

    @PostMapping()
    public RespuestaReclamo guardarRespuestaReclamo(@RequestBody RespuestaReclamo respuestaReclamo){
        return this.respuestareclamoService.guardarRespuesta(respuestaReclamo);
    }

    @GetMapping( path = "/{id}")
    public Optional<RespuestaReclamo> obtenerRespuestaPorId(@PathVariable("id") Long id) {
        return this.respuestareclamoService.obtenerPorId(id);
    }

    /*
    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }*/

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.respuestareclamoService.eliminarReclamo(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}
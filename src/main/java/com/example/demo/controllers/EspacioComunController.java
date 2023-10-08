package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.EspacioComun;
import com.example.demo.services.EspacioComunService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/espaciocomun")
public class EspacioComunController {
    @Autowired
    EspacioComunService espacioComunService;

    @GetMapping()
    public ArrayList<EspacioComun> obtenerEspaciosComunes(){
        return espacioComunService.obtenerEdificios();
    }

    @PostMapping()
    public EspacioComun guardarEspacioComun(@RequestBody EspacioComun espacioComun){
        return this.espacioComunService.guardarEdificio(espacioComun);
    }

    @GetMapping(path = "/{id}")
    public Optional<EspacioComun> obtenerEspacioPorId(@PathVariable("id") Long id) {
        return this.espacioComunService.obtenerPorId(id);
    }

    /*
    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }*/

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.espacioComunService.eliminarEspacioComun(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}
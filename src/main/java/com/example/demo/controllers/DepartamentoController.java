package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Departamento;
import com.example.demo.models.Usuario;
import com.example.demo.services.DepartamentoService;
import com.example.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    @Autowired
    DepartamentoService deptoService;

    @GetMapping()
    public ArrayList<Departamento> obtenerUsuarios(){
        return deptoService.obtenerDeptos();
    }

    @PostMapping()
    public Departamento guardarDepto(@RequestBody Departamento depto){
        return this.deptoService.guardarDepto(depto);
    }

    @GetMapping( path = "/{id}")
    public Optional<Departamento> obtenerDeptoPorId(@PathVariable("id") Long id) {
        return this.deptoService.obtenerPorId(id);
    }

    /*
    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }*/

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.deptoService.eliminarDepto(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}
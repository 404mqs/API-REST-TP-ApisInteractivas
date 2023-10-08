package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Departamento;
import com.example.demo.models.Usuario;
import com.example.demo.repositories.DepartamentoRepository;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {
    @Autowired
    DepartamentoRepository depaRepository;
    
    public ArrayList<Departamento> obtenerDeptos(){
        return (ArrayList<Departamento>) depaRepository.findAll();
    }

    public Departamento guardarDepto(Departamento usuario){
        return depaRepository.save(usuario);
    }

    public Optional<Departamento> obtenerPorId(Long id){
        return depaRepository.findById(id);
    }


    public boolean eliminarDepto(Long id) {
        try{
        	depaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
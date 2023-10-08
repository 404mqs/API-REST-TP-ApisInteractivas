package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
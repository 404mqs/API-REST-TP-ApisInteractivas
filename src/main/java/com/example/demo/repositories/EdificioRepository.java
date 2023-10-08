package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.Edificio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends CrudRepository<Edificio, Long> {

}
package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.EdificioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends CrudRepository<EdificioModel, Long> {

}
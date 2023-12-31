package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.Reclamo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamoRepository extends CrudRepository<Reclamo, Long> {

}
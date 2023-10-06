package com.example.demo.repositories;

import com.example.demo.models.ReclamoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamoRepository extends CrudRepository<ReclamoModel, Long> {

}
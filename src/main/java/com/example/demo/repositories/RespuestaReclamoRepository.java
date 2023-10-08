package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.Reclamo;
import com.example.demo.models.RespuestaReclamo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaReclamoRepository extends CrudRepository<RespuestaReclamo, Long> {

}
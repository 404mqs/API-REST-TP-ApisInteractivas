package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.EspacioComun;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacioComunRepository extends CrudRepository<EspacioComun, Long> {

}
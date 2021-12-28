package com.example.demo.repo;

import com.example.demo.personas.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepo extends CrudRepository<Persona,Integer> {
}

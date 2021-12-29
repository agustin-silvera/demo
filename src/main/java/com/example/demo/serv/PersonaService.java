package com.example.demo.serv;


import com.example.demo.personas.Persona;
import com.example.demo.repo.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class PersonaService {
    @Autowired
    PersonaRepo personaRepo;

    @PersistenceContext
    EntityManager entityManager;

    public Persona nuevaPersona (Persona persona) {
        return PersonaRepo.save(persona);
    }
    @Transactional
    public Persona borrarPersona(Persona persona){
           Persona del = personaRepo.deleteById(Persona.getDni());
       return del;

    }


    @Transactional
    public Persona actualizarPersona(Persona persona){

        Persona per = persona.getDni();
                    Query query = entityManager.createNativeQuery("UPDATE persona SET Nombre= ?1, Apellido= ?2, Es_Empleado = ?3 WHERE dni = ?4");
                    query.setParameter(4,persona.getDni());
                    query.setParameter(1,persona.getNombre());
                    query.setParameter(2,persona.getApellido());
                    query.setParameter(3,persona.getEs_Empleado());
                    query.executeUpdate();
                    entityManager.flush();
                    return per;
        }

    }




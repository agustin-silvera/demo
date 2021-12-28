package com.example.demo.serv;


import com.example.demo.personas.Persona;
import com.example.demo.repo.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    PersonaRepo personaRepo;

    public Persona nuevaPersona (Persona persona) {
        return PersonaRepo.save(persona);
    }
    public void borrarPersona(Persona persona){
        personaRepo.deleteAllById(persona.getIdPersona());
    }



}

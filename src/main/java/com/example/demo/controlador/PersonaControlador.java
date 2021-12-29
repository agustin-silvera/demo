package com.example.demo.controlador;

import com.example.demo.personas.Persona;
import com.example.demo.serv.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaControlador {

    @Autowired
    PersonaService personaService;

    @PostMapping("/nuevaPersona")
    public Persona nuevaPersona(@RequestBody Persona persona) {
        return personaService.nuevaPersona(persona);
    }

    @PostMapping("/borrarPersona")
       public Persona personaService(@RequestBody Persona persona){
        Persona del = personaService.borrarPersona(persona);
        return del;

    }

    @PostMapping(path = "/actualizarPersona")
    public Persona actualizarPersona(@RequestBody Persona persona){
        Persona per = personaService.actualizarPersona(persona);
        return per;
    }


}

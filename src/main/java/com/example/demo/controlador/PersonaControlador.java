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
    @PostMapping("/borrarPersona"){
        Object del = personaService.borrarPersona(@RequestParam Integer idPersona);
        return del;
    }
    @PostMapping("/actualizarPersona"){
        public Persona actualizarPersona(@RequestBody Persona persona){
            Object per = personaService.actualizarPersona(persona);
            return per;
        }
    }


}

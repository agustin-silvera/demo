package com.example.demo.personas;


import javax.persistence.*;

@Entity
@Table(name = "challenge_api")

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)

    private Integer idPersona;

    private String nombre;
    private String apellido;
    private int dni;
    private String es_Empleado;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEs_Empleado() {
        return es_Empleado;
    }

    public void setEs_Empleado(String es_Empleado) {
        this.es_Empleado = es_Empleado;
    }
}





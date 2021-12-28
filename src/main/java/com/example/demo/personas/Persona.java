package com.example.demo.personas;


import javax.persistence.*;

@Entity
@Table(name = "challenge_api")

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Column(name = "idPersona", unique = true, nullable = false)

    private Integer idPersona;

    private String Nombre;
    private String Apellido;
    private int Dni;
    private String Es_Empleado;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }

    public String getEs_Empleado() {
        return Es_Empleado;
    }

    public void setEs_Empleado(String es_Empleado) {
        Es_Empleado = es_Empleado;
    }
}





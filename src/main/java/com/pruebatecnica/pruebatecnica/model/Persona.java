package com.pruebatecnica.pruebatecnica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona implements Serializable {

    private String identificacion;

    private String nombre;

    private String genero;

    private String edad;

    private String direccion;

    private String telefono;

}

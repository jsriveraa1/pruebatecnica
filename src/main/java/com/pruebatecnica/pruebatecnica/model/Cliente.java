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
public class Cliente implements Serializable{

    private Persona infoCliente;

    private String clave;

    private Integer estado;

}

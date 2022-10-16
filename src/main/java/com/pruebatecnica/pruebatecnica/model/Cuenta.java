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
public class Cuenta implements Serializable {

    private Long numCta;

    private Integer tipCta;

    private Long saldoInicial;

    private Cliente cliente;

    private Long idCliente;

    private Integer estado;

}

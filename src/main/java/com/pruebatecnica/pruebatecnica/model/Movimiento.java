package com.pruebatecnica.pruebatecnica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movimiento implements Serializable {

    private LocalDateTime fecha;

    private Integer tipoMovimiento;

    private Long valor;

    private Long saldo;

    private Cuenta cuenta;

}

package com.pruebatecnica.pruebatecnica.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "BAN_MOVIMIENTO_TBL")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MovimientoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item;

    private LocalDateTime fecha;

    @Column(name = "TIPO_MOVIMIENTO")
    private Integer tipoMovimiento;

    private Long valor;
    private Long saldo;

    @ManyToOne
    @JoinColumn(name = "numCta")
    private CuentaEntity cuentaEntity;

}

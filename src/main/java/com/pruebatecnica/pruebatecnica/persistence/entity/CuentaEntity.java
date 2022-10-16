package com.pruebatecnica.pruebatecnica.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BAN_CUENTA_TBL")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CuentaEntity implements Serializable {

    @Id
    @Column(name = "NUM_CTA")
    private Long numCta;

    @Column(name = "TIP_CTA")
    private Integer tipCta;

    @Column(name = "SALDO_INICIAL")
    private Long saldoInicial;

    @ManyToOne
    @JoinColumn(name = "clienteId")
    private ClienteEntity clienteEntity;

    private Integer estado;

}

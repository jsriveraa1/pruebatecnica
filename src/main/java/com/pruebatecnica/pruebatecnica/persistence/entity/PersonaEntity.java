package com.pruebatecnica.pruebatecnica.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BAN_PERSONA_TBL")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonaEntity implements Serializable {

    @Id
    private String identificacion;

    @Column(nullable = false)
    private String nombre;

    private String genero;

    private String edad;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String telefono;

    @OneToOne(mappedBy = "clienteId",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private ClienteEntity cliente;

}

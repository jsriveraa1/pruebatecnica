package com.pruebatecnica.pruebatecnica.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "BAN_CLIENTE_TBL")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClienteEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identificacion", referencedColumnName = "identificacion", nullable = false, unique = true)
    private PersonaEntity clienteId;

    private String clave;
    private Integer estado;

    @OneToMany(mappedBy = "clienteEntity",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Set<CuentaEntity> cuentaEntitySet;

}

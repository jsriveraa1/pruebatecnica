package com.pruebatecnica.pruebatecnica.model.mapper;

import com.pruebatecnica.pruebatecnica.persistence.entity.ClienteEntity;

public interface MapperRepositoryCuenta {

    ClienteEntity findByClienteId(long id);
}

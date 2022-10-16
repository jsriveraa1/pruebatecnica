package com.pruebatecnica.pruebatecnica.model.mapper;

import com.pruebatecnica.pruebatecnica.model.Cliente;
import com.pruebatecnica.pruebatecnica.persistence.entity.ClienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapperCliente {

    @Mapping(target = "clienteId", ignore = true)
    ClienteEntity clienteToClienteEntity(Cliente cliente);

    Cliente clienteEntityToCliente(ClienteEntity clienteEntity);
}

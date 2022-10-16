package com.pruebatecnica.pruebatecnica.model.mapper;

import com.pruebatecnica.pruebatecnica.model.Cliente;
import com.pruebatecnica.pruebatecnica.model.Persona;
import com.pruebatecnica.pruebatecnica.persistence.entity.PersonaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapperPersona {

    @Mapping(target = "identificacion", source = "cliente.infoCliente.identificacion")
    @Mapping(target = "nombre", source = "cliente.infoCliente.nombre")
    @Mapping(target = "genero", source = "cliente.infoCliente.genero")
    @Mapping(target = "edad", source = "cliente.infoCliente.edad")
    @Mapping(target = "direccion", source = "cliente.infoCliente.direccion")
    @Mapping(target = "telefono", source = "cliente.infoCliente.telefono")
    @Mapping(target = "cliente.estado", source = "cliente.estado")
    @Mapping(target = "cliente.clave", source = "cliente.clave")
    @Mapping(target = "cliente.clienteId", source = "cliente.infoCliente")
    PersonaEntity clienteToPersonaEntity(Cliente cliente);

    Persona personaEntityToPersona(PersonaEntity personaEntity);

}

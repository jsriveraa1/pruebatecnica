package com.pruebatecnica.pruebatecnica.model.mapper;

import com.pruebatecnica.pruebatecnica.model.Cuenta;
import com.pruebatecnica.pruebatecnica.persistence.entity.CuentaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {MapperCliente.class})
public interface MapperCuenta {

    CuentaEntity cuentaToCuentaEntity(Cuenta cuenta);

}

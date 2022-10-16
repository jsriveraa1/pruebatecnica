package com.pruebatecnica.pruebatecnica.logic.implement;

import com.pruebatecnica.pruebatecnica.logic.interfaces.CuentasInterfaces;
import com.pruebatecnica.pruebatecnica.model.Cuenta;
import com.pruebatecnica.pruebatecnica.model.Persona;
import com.pruebatecnica.pruebatecnica.model.exception.MessageResponse;
import com.pruebatecnica.pruebatecnica.model.mapper.MapperCuenta;
import com.pruebatecnica.pruebatecnica.persistence.entity.ClienteEntity;
import com.pruebatecnica.pruebatecnica.persistence.entity.CuentaEntity;
import com.pruebatecnica.pruebatecnica.persistence.repository.ClienteRepository;
import com.pruebatecnica.pruebatecnica.persistence.repository.CuentaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CuentasImpl implements CuentasInterfaces {

    private final MapperCuenta mapperCuenta;
    private final CuentaRepository cuentaRepository;
    private final ClienteRepository clienteRepository;

    public CuentasImpl(MapperCuenta mapperCuenta, CuentaRepository cuentaRepository, ClienteRepository clienteRepository){
        this.mapperCuenta = mapperCuenta;
        this.cuentaRepository = cuentaRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ResponseEntity<MessageResponse> crear(Cuenta cuenta) {
        try{
            ClienteEntity clienteEntity = clienteRepository.findByClienteId(cuenta.getIdCliente());
//            cuenta.setCliente(clienteEntity);
            CuentaEntity cuentaEntity = mapperCuenta.cuentaToCuentaEntity(cuenta);
            cuentaRepository.save(cuentaEntity);
            return ResponseEntity.ok().body(new MessageResponse("Cuenta registrada con exito."));
        }catch (Exception e){
            return ResponseEntity.ok().body(new MessageResponse("Error al registrar la cuenta."));
        }
    }

    @Override
    public ResponseEntity<Persona> consultar(Long numCta) {
        return null;
    }

    @Override
    public ResponseEntity<MessageResponse> actualizar(Cuenta cuenta) {
        return null;
    }

    @Override
    public ResponseEntity<MessageResponse> eliminar(Long numCta) {
        return null;
    }
}

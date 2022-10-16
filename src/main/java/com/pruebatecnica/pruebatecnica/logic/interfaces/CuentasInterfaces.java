package com.pruebatecnica.pruebatecnica.logic.interfaces;

import com.pruebatecnica.pruebatecnica.model.Cuenta;
import com.pruebatecnica.pruebatecnica.model.Persona;
import com.pruebatecnica.pruebatecnica.model.exception.MessageResponse;
import org.springframework.http.ResponseEntity;

public interface CuentasInterfaces {

    ResponseEntity<MessageResponse> crear(Cuenta cuenta);

    ResponseEntity<Persona> consultar(Long numCta);

    ResponseEntity<MessageResponse> actualizar(Cuenta cuenta);

    ResponseEntity<MessageResponse> eliminar(Long numCta);

}

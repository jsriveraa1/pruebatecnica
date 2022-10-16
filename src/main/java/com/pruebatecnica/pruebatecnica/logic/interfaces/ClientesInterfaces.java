package com.pruebatecnica.pruebatecnica.logic.interfaces;

import com.pruebatecnica.pruebatecnica.model.Cliente;
import com.pruebatecnica.pruebatecnica.model.Persona;
import com.pruebatecnica.pruebatecnica.model.exception.MessageResponse;
import org.springframework.http.ResponseEntity;

public interface ClientesInterfaces {

    ResponseEntity<MessageResponse> crear(Cliente cliente);

    ResponseEntity<Persona> consultar(Long identificacion);

    ResponseEntity<MessageResponse> actualizar(Cliente cliente);

    ResponseEntity<MessageResponse> eliminar(Long identificacion);

}

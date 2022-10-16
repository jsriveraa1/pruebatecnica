package com.pruebatecnica.pruebatecnica.logic.interfaces;

import org.springframework.http.ResponseEntity;

public interface MovimientosInterfaces {

    ResponseEntity<String> crear();

    ResponseEntity<String> consultar();

    ResponseEntity<String> actualizar();

    ResponseEntity<String> eliminar();
}

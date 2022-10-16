package com.pruebatecnica.pruebatecnica.controller;

import com.pruebatecnica.pruebatecnica.logic.interfaces.CuentasInterfaces;
import com.pruebatecnica.pruebatecnica.model.Cuenta;
import com.pruebatecnica.pruebatecnica.model.Persona;
import com.pruebatecnica.pruebatecnica.model.exception.MessageResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/cuentas")
public class CuentasController {

    private final CuentasInterfaces cuentasInterfaces;

    public CuentasController(CuentasInterfaces cuentasInterfaces) {
        this.cuentasInterfaces = cuentasInterfaces;
    }

    @GetMapping(value = "consultar", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<Persona> consultar(@RequestParam Long numCta){
        return cuentasInterfaces.consultar(numCta);
    }

    @PostMapping(value = "crear", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<MessageResponse> crear(@Valid @RequestBody Cuenta cuenta){
        return cuentasInterfaces.crear(cuenta);
    }

    @PutMapping(value = "actualizar", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<MessageResponse> actualizar(@Valid @RequestBody Cuenta cuenta){
        return cuentasInterfaces.actualizar(cuenta);
    }

    @DeleteMapping(value = "eliminar", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<MessageResponse> eliminar(@RequestParam Long numCta){
        return cuentasInterfaces.eliminar(numCta);
    }
    
}

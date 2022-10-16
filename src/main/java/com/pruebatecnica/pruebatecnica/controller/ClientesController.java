package com.pruebatecnica.pruebatecnica.controller;

import com.pruebatecnica.pruebatecnica.logic.interfaces.ClientesInterfaces;
import com.pruebatecnica.pruebatecnica.model.Cliente;
import com.pruebatecnica.pruebatecnica.model.Persona;
import com.pruebatecnica.pruebatecnica.model.exception.MessageResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/cliente")
public class ClientesController {

    private final ClientesInterfaces clientesInterfaces;

    public ClientesController(ClientesInterfaces clientesInterfaces){
        this.clientesInterfaces = clientesInterfaces;
    }

    @GetMapping(value = "consultar", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<Persona> consultar(@RequestParam Long identificacion){
        return clientesInterfaces.consultar(identificacion);
    }

    @PostMapping(value = "crear", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<MessageResponse> crear(@Valid @RequestBody Cliente cliente){
        return clientesInterfaces.crear(cliente);
    }

    @PutMapping(value = "actualizar", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<MessageResponse> actualizar(@Valid @RequestBody Cliente cliente){
        return clientesInterfaces.actualizar(cliente);
    }

    @DeleteMapping(value = "eliminar", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<MessageResponse> eliminar(@RequestParam Long identificacion){
        return clientesInterfaces.eliminar(identificacion);
    }
}

package com.pruebatecnica.pruebatecnica.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/movimiento")
public class MovimientosController {

    @GetMapping(value = "consultar", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<String> consultar(@RequestParam String fechaInicio, @RequestParam String fechaFinal,
                                             @RequestParam Long identificacion){
        return null;
    }

    @PostMapping(value = "crear", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<String> crear(@Valid RequestBody Movimiento){
        return null;
    }

    @PutMapping(value = "actualizar", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<String> actualizar(@RequestParam String fechaInicio, @RequestParam String fechaFinal,
                                             @RequestParam Long identificacion){
        return null;
    }

    @DeleteMapping(value = "eliminar", produces = {MediaType.APPLICATION_JSON_VALUE})
    private ResponseEntity<String> eliminar(@RequestParam String fechaInicio, @RequestParam String fechaFinal,
                                             @RequestParam Long identificacion){
        return null;
    }


}

package com.pruebatecnica.pruebatecnica.logic.implement;

import com.pruebatecnica.pruebatecnica.logic.interfaces.ClientesInterfaces;
import com.pruebatecnica.pruebatecnica.model.Cliente;
import com.pruebatecnica.pruebatecnica.model.Persona;
import com.pruebatecnica.pruebatecnica.model.exception.MessageResponse;
import com.pruebatecnica.pruebatecnica.model.mapper.MapperCliente;
import com.pruebatecnica.pruebatecnica.model.mapper.MapperPersona;
import com.pruebatecnica.pruebatecnica.persistence.entity.PersonaEntity;
import com.pruebatecnica.pruebatecnica.persistence.repository.ClienteRepository;
import com.pruebatecnica.pruebatecnica.persistence.repository.PersonaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ClientesImpl implements ClientesInterfaces {

    private final MapperCliente mapperCliente;
    private final MapperPersona mapperPersona;
    private final ClienteRepository clienteRepository;
    private final PersonaRepository personaRepository;


    public ClientesImpl(MapperCliente mapperCliente, MapperPersona mapperPersona, ClienteRepository clienteRepository, PersonaRepository personaRepository){
        this.mapperCliente = mapperCliente;
        this.mapperPersona = mapperPersona;
        this.clienteRepository = clienteRepository;
        this.personaRepository = personaRepository;
    }

    @Override
    public ResponseEntity<MessageResponse> crear(Cliente cliente) {
        try{
            PersonaEntity personaEntity = mapperPersona.clienteToPersonaEntity(cliente);
            personaRepository.save(personaEntity);
            return ResponseEntity.ok().body(new MessageResponse("Cliente registrado con exito."));
        }catch (Exception e){
            return ResponseEntity.ok().body(new MessageResponse("Error al registrar cliente, seguramente ya existe."));
        }
    }

    @Override
    public ResponseEntity<Persona> consultar(Long identificacion) {
        Optional<PersonaEntity> personaEntity = personaRepository.findById(identificacion);
        if(!personaEntity.isPresent()) throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error, el cliente no existe.");
        return ResponseEntity.ok().body(mapperPersona.personaEntityToPersona(personaEntity.get()));
    }

    @Override
    public ResponseEntity<MessageResponse> actualizar(Cliente cliente) {
        try{
            PersonaEntity personaEntity = mapperPersona.clienteToPersonaEntity(cliente);
            personaRepository.save(personaEntity);
            return ResponseEntity.ok().body(new MessageResponse("Cliente actualizado con exito."));
        }catch (Exception e){
            return ResponseEntity.ok().body(new MessageResponse("Error al actualizar el cliente."));
        }
    }

    @Override
    public ResponseEntity<MessageResponse> eliminar(Long identificacion) {
        try{
            Optional<PersonaEntity> personaEntity = personaRepository.findById(identificacion);
            if(!personaEntity.isPresent()) return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                    body(new MessageResponse("Error, el cliente no existe."));
            personaRepository.delete(personaEntity.get());
            return ResponseEntity.ok().body(new MessageResponse("Cliente registrado con exito."));
        }catch (Exception e){
            return ResponseEntity.ok().body(new MessageResponse("Error al eliminar el cliente."));
        }
    }
}

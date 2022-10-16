package com.pruebatecnica.pruebatecnica.persistence.repository;

import com.pruebatecnica.pruebatecnica.persistence.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    ClienteEntity findByClienteId(Long idCliente);

}

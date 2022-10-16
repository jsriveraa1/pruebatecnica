package com.pruebatecnica.pruebatecnica.persistence.repository;

import com.pruebatecnica.pruebatecnica.persistence.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
}

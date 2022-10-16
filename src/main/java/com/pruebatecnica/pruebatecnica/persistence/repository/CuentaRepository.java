package com.pruebatecnica.pruebatecnica.persistence.repository;

import com.pruebatecnica.pruebatecnica.persistence.entity.CuentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends JpaRepository<CuentaEntity, Long> {
}

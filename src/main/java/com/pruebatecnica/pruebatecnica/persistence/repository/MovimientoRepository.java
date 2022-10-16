package com.pruebatecnica.pruebatecnica.persistence.repository;

import com.pruebatecnica.pruebatecnica.persistence.entity.MovimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<MovimientoEntity, Long> {
}

package com.GourmetBoxBackEnd.gourmetBoxBackEnd.repository;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
}

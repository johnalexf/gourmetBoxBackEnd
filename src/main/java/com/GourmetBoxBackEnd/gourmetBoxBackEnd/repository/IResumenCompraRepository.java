package com.GourmetBoxBackEnd.gourmetBoxBackEnd.repository;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ResumenCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResumenCompraRepository extends JpaRepository<ResumenCompra,Integer> {
}

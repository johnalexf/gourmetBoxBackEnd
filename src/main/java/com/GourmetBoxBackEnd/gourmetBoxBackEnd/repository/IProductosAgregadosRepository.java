package com.GourmetBoxBackEnd.gourmetBoxBackEnd.repository;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ProductosAgregados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductosAgregadosRepository extends JpaRepository<ProductosAgregados, Integer> {
}

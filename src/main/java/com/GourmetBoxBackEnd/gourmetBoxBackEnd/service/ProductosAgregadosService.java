package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Producto;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ProductosAgregados;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Usuario;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.repository.IProductosAgregadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosAgregadosService implements IProductosAgregadosService{

    @Autowired
    private IProductosAgregadosRepository productosAgregadosRepository;

    @Override
    public List<ProductosAgregados> getProductosAgergados() {
        List<ProductosAgregados> listaProductosAgregados = productosAgregadosRepository.findAll();
        return listaProductosAgregados;
    }

    @Override
    public void saveProductosAgregados(ProductosAgregados productosAgregados) {
        productosAgregadosRepository.save(productosAgregados);
    }

    @Override
    public ProductosAgregados findProductoAgregadoById(Integer id) {
        ProductosAgregados productosAgregados = productosAgregadosRepository.findById(id).orElse(null);
        return productosAgregados;
    }

    @Override
    public void deleteProductoAgregado(Integer id) {
        productosAgregadosRepository.deleteById(id);
    }

    @Override
    public void editProductoAgregado(Integer idOriginal, Usuario nuevoUsuario, Producto nuevoProducto, Integer nuevaCantidadProducto, Double nuevoSubtotal) {
        ProductosAgregados productosA = this.findProductoAgregadoById(idOriginal);
        productosA.setUsuario(nuevoUsuario);
        productosA.setProducto(nuevoProducto);
        productosA.setCantidadProducto(nuevaCantidadProducto);
        productosA.setSubtotal(nuevoSubtotal);
        this.saveProductosAgregados(productosA);
    }
}

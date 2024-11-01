package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Producto;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ProductosAgregados;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ResumenCompra;
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
    public List<ProductosAgregados> getProductosAgregados() {
        List<ProductosAgregados> listaProductosAgregados = productosAgregadosRepository.findAll();
        return listaProductosAgregados;
    }

    @Override
    public void saveProductosAgregados(ProductosAgregados productosAgregados) {
        productosAgregadosRepository.save(productosAgregados);
    }

    @Override
    public ProductosAgregados findProductosAgregadosById(Integer id) {
        ProductosAgregados productosAgregados = productosAgregadosRepository.findById(id).orElse(null);
        return productosAgregados;
    }

    @Override
    public void deleteProductosAgregados(Integer id) {
        productosAgregadosRepository.deleteById(id);
    }

    @Override
    public void editProductosAgregados(Integer idOriginal, Usuario nuevoUsuario, ResumenCompra idResumenCompraNuevo, Producto nuevoProducto, Integer nuevaCantidadProducto, Double nuevoSubtotal) {
        ProductosAgregados productosA = this.findProductoAgregadoById(idOriginal);
        productosA.setUsuario_id(nuevoUsuario);
        productosA.setProducto_id(nuevoProducto);
        productosA.setResumen_compra_id(idResumenCompraNuevo);
        productosA.setCantidad_producto(nuevaCantidadProducto);
        productosA.setSubtotal(nuevoSubtotal);
        this.saveProductosAgregados(productosA);
    }
}

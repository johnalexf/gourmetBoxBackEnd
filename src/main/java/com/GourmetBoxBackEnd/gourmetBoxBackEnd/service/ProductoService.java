package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Producto;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public List<Producto> getProductos() {
        List<Producto> listaProductos = productoRepository.findAll();
        return listaProductos;
    }

    @Override
    public void saveProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public Producto findProductoById(Integer id) {
        Producto producto = productoRepository.findById(id).orElse(null);
        return producto;
    }

    @Override
    public void deleteProducto(Integer id) {
        productoRepository.deleteById(id);
    }

    @Override
    public void editProducto(Integer idOriginal, String nuevoNombreProducto,
                             String nuevoDescripcionProducto, String nuevoCategoria,
                             String nuevoImgProducto, Double nuevoPrecioProducto) {

            Producto producto=this.findProductoById(idOriginal);
            if(nuevoNombreProducto!=null){producto.setNombre_producto(nuevoNombreProducto);}
            if(nuevoDescripcionProducto!=null){producto.setDescripcion_producto(nuevoDescripcionProducto);}
            if(nuevoCategoria!=null){producto.setCategoria(nuevoCategoria);}
            if(nuevoImgProducto!=null){producto.setImg_producto(nuevoImgProducto);}
            if(nuevoPrecioProducto!=null){producto.setPrecio_producto(nuevoPrecioProducto);}
            this.productoRepository.save(producto);
    }
}

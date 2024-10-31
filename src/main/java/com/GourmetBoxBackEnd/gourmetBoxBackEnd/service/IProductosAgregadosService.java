package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Producto;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ProductosAgregados;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Usuario;

import java.util.List;

public interface IProductosAgregadosService {


    //Traer todas los productos
    public List<ProductosAgregados> getProductosAgergados();

    //Guardar producto
    public void saveProductosAgregados(ProductosAgregados productosAgregados);

    //buscar producto agregado
    public ProductosAgregados findProductoAgregadoById(Integer id);

    //eliminar producto agregado
    public void deleteProductoAgregado(Integer id);

    //editar producto agregado
    public void editProductoAgregado(Integer idOriginal, Integer nuevoUsuario, Integer nuevoProducto, Integer nuevaCantidadProducto, Double nuevoSubtotal);


}

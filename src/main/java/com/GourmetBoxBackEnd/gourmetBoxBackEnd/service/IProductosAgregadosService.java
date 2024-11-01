package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Producto;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ProductosAgregados;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ResumenCompra;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Usuario;

import java.util.List;

public interface IProductosAgregadosService {


    //Traer todas los productos
    List<ProductosAgregados> getProductosAgregados();

    //Guardar producto
    public void saveProductosAgregados(ProductosAgregados productosAgregados);

    //buscar producto agregado
    public ProductosAgregados findProductoAgregadoById(Integer id);

    //eliminar producto agregado
    public void deleteProductosAgregados(Integer id);

    //editar producto agregado
    public void editProductosAgregados(Integer idOriginal, Usuario nuevoUsuario, ResumenCompra idResumenCompraNuevo, Producto nuevoProducto, Integer nuevaCantidadProducto, Double nuevoSubtotal);


}

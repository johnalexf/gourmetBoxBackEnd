package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;


import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Producto;

import java.util.List;

public interface IProductoService {

    //Traer todas los productos
    public List<Producto> getProductos();

    //Guardar producto
    public void saveProducto(Producto producto);

    //buscar producto
    public Producto findProductoById(Integer id);

    //eliminar producto
    public void deleteProducto(Integer id);

    //editar producto
    public void editProducto(Integer idOriginal, String nuevoNombreProducto, String nuevoDescripcionProducto, String nuevoCategoria, String nuevoImgProducto, Double nuevoPrecioProducto);

}

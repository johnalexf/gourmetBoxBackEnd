package com.GourmetBoxBackEnd.gourmetBoxBackEnd.controller;


import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Producto;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ProductosAgregados;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ResumenCompra;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Usuario;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.service.IProductosAgregadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductosAgregadosController {

    @Autowired
    private IProductosAgregadosService productosAgregadosService;

    //metodo para obtener todos los productosAgregados
    @GetMapping("/productosagregados/traer")
    public List<ProductosAgregados> getProductosAgregados(){
        return productosAgregadosService.getProductosAgregados();
    }

    //metodo para guardar
    @PostMapping("/productosagregados/crear")
    public String saveProductosAgregados(@RequestBody ProductosAgregados productosAgregados){
        productosAgregadosService.saveProductosAgregados(productosAgregados);
        return "Producto Agregado con exito";
    }

    //metodo para eliminar
    @DeleteMapping("/productosagregados/borrar/{id}")
    public String deleteProductosAgregados(@PathVariable Integer id){
        productosAgregadosService.deleteProductosAgregados(id);
        return "Producto Eliminado con exito";
    }

    //metodo para editar
    @PutMapping("/productosagregados/editar/{id}")
    public ProductosAgregados editProductosAgregados(
            @PathVariable Integer id,
            @RequestParam(required = false, name = "usuario") Usuario nuevoUsuario,
            @RequestParam(required = false, name = "resumenCompra") ResumenCompra nuevoResumenCompra,
            @RequestParam(required = false, name = "producto") Producto nuevoProducto,
            @RequestParam(required = false, name = "cantidadProducto") Integer nuevaCantidadProducto,
            @RequestParam(required = false, name = "subtotal") Double nuevoSubtotal

    ){
        productosAgregadosService.editProductosAgregados(id,nuevoUsuario, nuevoResumenCompra, nuevoProducto, nuevaCantidadProducto, nuevoSubtotal);
        ProductosAgregados productosAgregados = productosAgregadosService.findProductoAgregadoById(id);
        return productosAgregados;
    }





}

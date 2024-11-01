package com.GourmetBoxBackEnd.gourmetBoxBackEnd.controller;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Producto;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    //metodo para obtener todos los productos
    @GetMapping("/producto/traer")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }

    /*
    {
    nombre: "nombre producto"

    }
    */
    //metodo para guardar producto
    @PostMapping("/productos/crear")
    public String saveProducto(@RequestBody Producto producto){
        productoService.saveProducto(producto);
        return "El producto se creo con exito";
    }

    //metodo para eliminar
    // localhost:8080producto/borrar/3"
    @DeleteMapping("/producto/borrar/{id}")
    public String deleteProducto(@PathVariable Integer id){
        productoService.deleteProducto(id);
        return "Producto eliminado con exito";
    }


    //metodo para obtener un producto


    // localhost:8080producto/borrar/3 nombre="ana"
    //metodo para editar producto
    @PutMapping("/producto/editar/{id}")
    public Producto editProducto( @PathVariable Integer id,
                                  @RequestParam(required = false, name="nombre") String nuevoNombre,
                                  @RequestParam(required = false, name="descripcion") String nuevadescripcion,
                                  @RequestParam(required = false, name="categoria") String nuevaCategoria,
                                  @RequestParam(required = false, name="image") String nuevoImagen,
                                  @RequestParam(required = false, name="precio") Double nuevoPrecio
    ){
        editProducto(id, nuevoNombre, nuevadescripcion, nuevaCategoria, nuevoImagen, nuevoPrecio);
        Producto producto = productoService.findProductoById(id);
        return producto;
    }


}

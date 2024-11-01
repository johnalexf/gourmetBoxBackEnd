package com.GourmetBoxBackEnd.gourmetBoxBackEnd.controller;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ResumenCompra;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.service.IResumenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ResumenCompraController {

    @Autowired
    private IResumenCompraService resumenCompraService;

    //metodo para obtener todos los resumenes de compra
    @GetMapping("/resumencompra/traer")
    public List<ResumenCompra> getProductos() {
        return resumenCompraService.getResumenCompra();
    }

    /*

     */
    //metodo para guardar resumen compra
    @PostMapping("/resumencompra/crear")
    public String saveResumenCompra(@RequestBody ResumenCompra resumenCompra) {
        resumenCompraService.saveResumenCompra(resumenCompra);
        return "El resumen compra se creo con exito";
    }




//metodo para editar resumen compra
@PutMapping("/resumencompra/editar/{id}")
public ResumenCompra editResumenCompra( @PathVariable Integer id,
                                        @RequestParam(required = false, name="en_proceso") boolean en_proceso,
                                        @RequestParam(required = false, name="fecha_resumen_compra") Date fecha_resumen_compra,
                                        @RequestParam(required = false, name="precio_total_productos") Double precio_total_productos,
                                        @RequestParam(required = false, name="precio_domicilio") Double precio_domicilio,
                                        @RequestParam(required = false, name="precio_total") Double precio_total
){
   // Integer idResumenCompraOriginal, Double nuevoPrecioTotalProductos, Double nuevoPrecioDomicilio, Double nuevoPrecioTotal, boolean nuevoEnproceso, Date nuevaFechaResumenCompra
    resumenCompraService.editResumenCompra(id,precio_total_productos,precio_domicilio,precio_total, en_proceso,fecha_resumen_compra);
    ResumenCompra resumenCompra = resumenCompraService.findResumenCompraById(id);

    return resumenCompra;
}



}
package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Producto;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ResumenCompra;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

public interface IResumenCompraService {

    //Traer todos los Resumenes de Compra
    public List<ResumenCompra> getResumenCompra();

    //Guardar Resumen de Compra
    public void saveResumenCompra(ResumenCompra resumenCompra);

    //buscar ResumenCompra por Id de ResumenCompra
    public ResumenCompra findResumenCompraById(Integer idResumenCompraABuscar);

    //eliminar ResumenCompra
    public void deleteResumenCompra(Integer idResumenCompraAEliminar);

    //editar ResumenCompra
    public void editResumenCompra(Integer idResumenCompraOriginal, Double nuevoPrecioTotalProductos, Double nuevoPrecioDomicilio, Double nuevoPrecioTotal, boolean nuevoEnproceso, Date nuevaFechaResumenCompra);

}

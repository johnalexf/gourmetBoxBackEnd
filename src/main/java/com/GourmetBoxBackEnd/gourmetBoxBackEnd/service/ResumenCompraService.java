package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;


import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.ResumenCompra;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.repository.IResumenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ResumenCompraService implements IResumenCompraService{

    @Autowired
    private IResumenCompraRepository resumenCompraRepository;

    @Override
    public List<ResumenCompra> getResumenCompra() {
        List<ResumenCompra> listaResumenCompra = resumenCompraRepository.findAll();
        return listaResumenCompra;
    }

    @Override
    public void saveResumenCompra(ResumenCompra resumenCompra) {
        resumenCompraRepository.save(resumenCompra);
    }

    @Override
    public ResumenCompra findResumenCompraById(Integer idResumenCompraABuscar) {
        ResumenCompra resumenCompraBuscado = resumenCompraRepository.findById(idResumenCompraABuscar).orElse(null);
        return resumenCompraBuscado;
    }

    @Override
    public void deleteResumenCompra(Integer idResumenCompraAEliminar) {
        resumenCompraRepository.deleteById(idResumenCompraAEliminar);
    }

    @Override
    public void editResumenCompra(Integer idResumenCompraOriginal, Double nuevoPrecioTotalProductos, Double nuevoPrecioDomicilio, Double nuevoPrecioTotal, boolean nuevoEnproceso, Date nuevaFechaResumenCompra) {
        ResumenCompra resumenCompraOriginal=this.findResumenCompraById(idResumenCompraOriginal);
        resumenCompraOriginal.setPrecio_total_productos(nuevoPrecioTotalProductos);
        resumenCompraOriginal.setPrecio_domicilio(nuevoPrecioDomicilio);
        resumenCompraOriginal.setPrecio_total(nuevoPrecioTotal);
        resumenCompraOriginal.setEn_proceso(nuevoEnproceso);
        resumenCompraOriginal.setFecha_resumen_compra(nuevaFechaResumenCompra);
        this.saveResumenCompra(resumenCompraOriginal);
    }
}

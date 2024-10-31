package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
public class ResumenCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idResumenCompra;
    @Column(nullable = false)
    private int usuarioId;
    @Column(nullable = false)
    private boolean enProceso;
    private Date fechaResumenCompra;
    private Double precioTotalProductos;
    private Double precioDomicilio;
    private Double precioTotal;

    public boolean isEnProceso() {
        return enProceso;
    }

    public void setEnProceso(boolean enProceso) {
        this.enProceso = enProceso;
    }

    public Date getFechaResumenCompra() {
        return fechaResumenCompra;
    }

    public void setFechaResumenCompra(Date fechaResumenCompra) {
        this.fechaResumenCompra = fechaResumenCompra;
    }

    public ResumenCompra() {
    }

    public ResumenCompra(int idResumenCompra, int usuarioId, boolean enProceso) {
        this.idResumenCompra = idResumenCompra;
        this.usuarioId = usuarioId;
        this.enProceso=enProceso;
    }

    public int getIdResumenCompra() {
        return idResumenCompra;
    }

    public void setIdResumenCompra(int idResumenCompra) {
        this.idResumenCompra = idResumenCompra;
    }

    public Double getPrecioTotalProductos() {
        return precioTotalProductos;
    }

    public void setPrecioTotalProductos(Double precioTotalProductos) {
        this.precioTotalProductos = precioTotalProductos;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Double getPrecioDomicilio() {
        return precioDomicilio;
    }

    public void setPrecioDomicilio(Double precioDomicilio) {
        this.precioDomicilio = precioDomicilio;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
//CREATE TABLE resumenCompra(
//        idResumenCompra INT PRIMARY KEY AUTO_INCREMENT,
//        usuarioId INT NOT NULL,
//        precioTotalProductos DOUBLE NOT NULL,
//        precioDomicilio DECIMAL(10,2) NOT NULL,
//precioTotal DECIMAL(10,2) NOT NULL,
//FOREIGN KEY (usuarioId) REFERENCES usuario(idUsuario)
//        );
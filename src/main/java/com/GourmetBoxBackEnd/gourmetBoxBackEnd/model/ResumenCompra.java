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
    private int id_resumen_compra;
    @Column(nullable = false)
    private int usuario_id;
    @Column(nullable = false)
    private boolean en_proceso;
    private Date fecha_resumen_compra;
    private Double precio_total_productos;
    private Double precio_domicilio;
    private Double precio_total;

    public ResumenCompra() {
    }

    public ResumenCompra(int id_resumen_compra, int usuario_id, boolean en_proceso) {
        this.id_resumen_compra = id_resumen_compra;
        this.usuario_id = usuario_id;
        this.en_proceso = en_proceso;
    }

    public int getId_resumen_compra() {
        return id_resumen_compra;
    }

    public void setId_resumen_compra(int id_resumen_compra) {
        this.id_resumen_compra = id_resumen_compra;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public boolean isEn_proceso() {
        return en_proceso;
    }

    public void setEn_proceso(boolean en_proceso) {
        this.en_proceso = en_proceso;
    }

    public Date getFecha_resumen_compra() {
        return fecha_resumen_compra;
    }

    public void setFecha_resumen_compra(Date fecha_resumen_compra) {
        this.fecha_resumen_compra = fecha_resumen_compra;
    }

    public Double getPrecio_total_productos() {
        return precio_total_productos;
    }

    public void setPrecio_total_productos(Double precio_total_productos) {
        this.precio_total_productos = precio_total_productos;
    }

    public Double getPrecio_domicilio() {
        return precio_domicilio;
    }

    public void setPrecio_domicilio(Double precio_domicilio) {
        this.precio_domicilio = precio_domicilio;
    }

    public Double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Double precio_total) {
        this.precio_total = precio_total;
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
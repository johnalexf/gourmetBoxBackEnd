package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter
@Entity
public class ResumenCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_resumen_compra;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioResumen ;

    @Column(nullable = false)
    private boolean en_proceso;
    private Date fecha_resumen_compra;
    private Double precio_total_productos;
    private Double precio_domicilio;
    private Double precio_total;


    @OneToMany(mappedBy = "resumenCompra")
    @JsonIgnore
    private List<ProductosAgregados> productosAgregados;

    public ResumenCompra() {
    }

    public ResumenCompra(int id_resumen_compra,
                         Usuario usuarioResumen,
                         boolean en_proceso,
                         Date fecha_resumen_compra,
                         Double precio_total_productos,
                         Double precio_domicilio,
                         Double precio_total)
    {
        this.id_resumen_compra = id_resumen_compra;
        this.usuarioResumen = usuarioResumen;
        this.en_proceso = en_proceso;
        this.fecha_resumen_compra = fecha_resumen_compra;
        this.precio_total_productos = precio_total_productos;
        this.precio_domicilio = precio_domicilio;
        this.precio_total = precio_total;
    }

    public int getId_resumen_compra() {
        return id_resumen_compra;
    }

    public void setId_resumen_compra(int id_resumen_compra) {
        this.id_resumen_compra = id_resumen_compra;
    }

    public Usuario getUsuarioResumen() {
        return usuarioResumen;
    }

    public void setUsuarioResumen(Usuario usuarioResumen) {
        this.usuarioResumen = usuarioResumen;
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

    public List<ProductosAgregados> getProductosAgregados() {
        return productosAgregados;
    }

    public void setProductosAgregados(List<ProductosAgregados> productosAgregados) {
        this.productosAgregados = productosAgregados;
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
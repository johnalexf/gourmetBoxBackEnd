package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idProducto;
    @Column (nullable = false)
    private String nombreProducto;
    @Column (nullable = false)
    private String descripcionProducto;
    @Column (nullable = false)
    private String categoria;
    @Column (nullable = false)
    private String imgProducto;
    @Column (nullable = false)
    private Double precioProducto;

    public Producto(){

    }

    public Producto(int idProducto, String nombreProducto, String descripcionProducto, String categoria, String imgProducto, Double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.categoria = categoria;
        this.imgProducto = imgProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImgProducto() {
        return imgProducto;
    }

    public void setImgProducto(String imgProducto) {
        this.imgProducto = imgProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }
}

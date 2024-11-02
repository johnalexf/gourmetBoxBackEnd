package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
    @Column (nullable = false)
    private String nombre_producto;
    @Column (nullable = false)
    private String descripcion_producto;
    @Column (nullable = false)
    private String categoria;
    @Column (nullable = false)
    private String img_producto;
    @Column (nullable = false)
    private Double precio_producto;

    @OneToMany(mappedBy = "producto")
    @JsonIgnore
    private List<ProductosAgregados> productosAgregados;


//mascota clase que va tener la clave foranea
    //cuando usamos ManyToOne el reconoce que el id de llave primaria va ser la llave foranea
//    @ManyToOne //indica que varias mascotas pueden tener un dueño
//    @JoinColumn(name = "id_persona")
//    private Persona dueno;

//persona
    //    @OneToMany(mappedBy = "dueno")
//    private List<Mascota> mascotas;




    public Producto(){

    }

    public Producto(int id_producto, String nombre_producto, String descripcion_producto, String categoria, String img_producto, Double precio_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.categoria = categoria;
        this.img_producto = img_producto;
        this.precio_producto = precio_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImg_producto() {
        return img_producto;
    }

    public void setImg_producto(String img_producto) {
        this.img_producto = img_producto;
    }

    public Double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }
}

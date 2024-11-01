package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Suscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_suscripcion;

    @Column(nullable = false)
    private String nombre_plan;

    @Column(nullable = false)
    private String descripcion_plan;

    @Column(nullable = false)
    private double precio;

    @Column(nullable = false)
    private String img_suscripcion;

    // Constructor vacío
    public Suscripcion() {
    }

    // Constructor con parámetros
    public Suscripcion(Integer id_suscripcion, String nombre_plan, String descripcion_plan, double precio, String img_suscripcion) {
        this.id_suscripcion = id_suscripcion;
        this.nombre_plan = nombre_plan;
        this.descripcion_plan = descripcion_plan;
        this.precio = precio;
        this.img_suscripcion = img_suscripcion;
    }

    //Getter and Setter manuales

    public Integer getId_suscripcion() {
        return id_suscripcion;
    }

    public void setId_suscripcion(Integer id_suscripcion) {
        this.id_suscripcion = id_suscripcion;
    }

    public String getNombre_plan() {
        return nombre_plan;
    }

    public void setNombre_plan(String nombre_plan) {
        this.nombre_plan = nombre_plan;
    }

    public String getDescripcion_plan() {
        return descripcion_plan;
    }

    public void setDescripcion_plan(String descripcion_plan) {
        this.descripcion_plan = descripcion_plan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImg_suscripcion() {
        return img_suscripcion;
    }

    public void setImg_suscripcion(String img_suscripcion) {
        this.img_suscripcion = img_suscripcion;
    }
}
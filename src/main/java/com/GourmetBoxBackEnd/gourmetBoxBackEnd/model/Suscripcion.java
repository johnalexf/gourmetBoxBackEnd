package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Suscripcion {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int idSuscripcion;
    @Column (nullable = false)
    private String nombrePlan;
    @Column (nullable = false)
    private String descripcionPlan;
    @Column (nullable = false)
    private double precio;
    @Column (nullable = false)
    private String imgSuscripcion;


    public Suscripcion(){

    }

    public Suscripcion(int idSuscripcion, String nombrePlan, String descripcionPlan, double precio, String imgSuscripcion) {
        this.idSuscripcion = idSuscripcion;
        this.nombrePlan = nombrePlan;
        this.descripcionPlan = descripcionPlan;
        this.precio = precio;
        this.imgSuscripcion = imgSuscripcion;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getDescripcionPlan() {
        return descripcionPlan;
    }

    public void setDescripcionPlan(String descripcionPlan) {
        this.descripcionPlan = descripcionPlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImgSuscripcion() {
        return imgSuscripcion;
    }

    public void setImgSuscripcion(String imgSuscripcion) {
        this.imgSuscripcion = imgSuscripcion;
    }
}

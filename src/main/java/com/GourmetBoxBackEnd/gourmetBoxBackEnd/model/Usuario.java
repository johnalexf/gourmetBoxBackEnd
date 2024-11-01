package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id_usuario;
    @Column(nullable = false)
    private String nombre_usuario;
    @Column (nullable = false)
    private String user_name;
    @Column (nullable = false)
    private String contrasena;
    @Column (nullable = false)
    private String correo;
    @Column (nullable = false)
    private String telefono;
    @Column (nullable = false)
    private Boolean es_administrador;

    //mascota
    //    @OneToOne(mappedBy = "miMascota")
    //    private Persona dueno;

    // persona
    //    @OneToOne //Establece la relacion de una a uno
    //    @JoinColumn(name = "mascotaId" , referencedColumnName = "id_mascota")
    //    private Mascota miMascota;

    @ManyToOne
    @JoinColumn(name = "suscripcion_id")
    private Suscripcion suscripcion;

    @OneToMany(mappedBy = "usuario")
    @JsonIgnore
    private List<ProductosAgregados> productosAgregados;

    @OneToMany(mappedBy = "usuarioResumen")
    @JsonIgnore
    private List<ResumenCompra> resumenCompras;

    public Usuario(){

    }

    public Usuario(int id_usuario,
                   String nombre_usuario,
                   String contrasena,
                   String user_name,
                   String correo,
                   String telefono,
                   Boolean es_administrador
    ) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.user_name = user_name;
        this.correo = correo;
        this.telefono = telefono;
        this.es_administrador = es_administrador;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getEs_administrador() {
        return es_administrador;
    }

    public void setEs_administrador(Boolean es_administrador) {
        this.es_administrador = es_administrador;
    }


    public List<ProductosAgregados> getProductosAgregados() {
        return productosAgregados;
    }

    public void setProductosAgregados(List<ProductosAgregados> productosAgregados) {
        this.productosAgregados = productosAgregados;
    }

    public List<ResumenCompra> getResumenCompras() {
        return resumenCompras;
    }

    public void setResumenCompras(List<ResumenCompra> resumenCompras) {
        this.resumenCompras = resumenCompras;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }
}

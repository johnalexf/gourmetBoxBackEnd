package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private int suscripcion_id;

    public Usuario(){

    }

    public Usuario(int id_usuario,
                   String nombre_usuario,
                   String contrasena,
                   String user_name,
                   String correo,
                   String telefono,
                   Boolean es_administrador,
                   int suscripcion_id) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.user_name = user_name;
        this.correo = correo;
        this.telefono = telefono;
        this.es_administrador = es_administrador;
        this.suscripcion_id = suscripcion_id;
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

    public int getSuscripcion_id() {
        return suscripcion_id;
    }

    public void setSuscripcion_id(int suscripcion_id) {
        this.suscripcion_id = suscripcion_id;
    }


}

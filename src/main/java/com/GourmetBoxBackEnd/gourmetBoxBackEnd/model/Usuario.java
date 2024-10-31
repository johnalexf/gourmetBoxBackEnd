package com.GourmetBoxBackEnd.gourmetBoxBackEnd.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int idUsuario;
    @Column(nullable = false)
    private String nombreUsuario;
    @Column (nullable = false)
    private String userName;
    @Column (nullable = false)
    private String contrasena;
    @Column (nullable = false)
    private String correo;
    @Column (nullable = false)
    private String telefono;
    @Column (nullable = false)
    private Boolean esAdministrador;

    private int suscripcionId;

    public Usuario(){

    }

    public Usuario(int idUsuario, String nombreUsuario,
                   int suscripcionId, Boolean esAdministrador,
                   String telefono, String correo,
                   String contrasena, String userName)
    {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.suscripcionId = suscripcionId;
        this.esAdministrador = esAdministrador;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.userName = userName;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Boolean getEsAdministrador() {
        return esAdministrador;
    }

    public void setEsAdministrador(Boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    public int getSuscripcionId() {
        return suscripcionId;
    }

    public void setSuscripcionId(int suscripcionId) {
        this.suscripcionId = suscripcionId;
    }
}

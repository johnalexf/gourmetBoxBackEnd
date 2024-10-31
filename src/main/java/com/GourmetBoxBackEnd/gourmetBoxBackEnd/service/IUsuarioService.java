package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    //Traer todos los usuarios
    public List<Usuario> getUsuarios();

    //Guardar usuario
    public void saveUsuario(Usuario usuario);

    //borrar usuario
    public void deleteUsuario(Integer id);

    //buscar usuario
    public Usuario findUsuarioByName(String userName);

    //modificar usuario
    public void editUsuario(String userNameOriginal,
                            String nuevoNombreUsuario,
                            String nuevoTelefono,
                            String nuevoCorreo);

    //metodo para modificar suscripcion de un usuario
    //pensado para una ampliacion del proyecto
}

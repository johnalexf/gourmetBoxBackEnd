package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;


import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Usuario;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private IUsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> listaUsuarios = usuarioRepository.findAll();
        return listaUsuarios;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findUsuarioByName(String userName) {
        Usuario usuario;
        usuario = usuarioRepository.findByNombre(userName);
        return usuario;
    }

    @Override
    public void editUsuario(String userNameOriginal,
                            String nuevoNombreUsuario,
                            String nuevoTelefono,
                            String nuevoCorreo)
    {
        Usuario usuario = this.findUsuarioByName(userNameOriginal);
        usuario.setNombreUsuario(nuevoNombreUsuario);
        usuario.setTelefono(nuevoTelefono);
        usuario.setCorreo(nuevoCorreo);
        this.saveUsuario(usuario);

    }
}

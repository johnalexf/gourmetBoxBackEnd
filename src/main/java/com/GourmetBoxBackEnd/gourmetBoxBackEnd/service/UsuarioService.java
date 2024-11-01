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
    public Usuario findUsuarioById(Integer id) {
        Usuario usuario;
        usuario = usuarioRepository.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public void editUsuario(Integer idOriginal,
                            String nuevoNombreUsuario,
                            String nuevoTelefono,
                            String nuevoCorreo)
    {
        Usuario usuario = this.findUsuarioById(idOriginal);
        usuario.setNombre_usuario(nuevoNombreUsuario);
        usuario.setTelefono(nuevoTelefono);
        usuario.setCorreo(nuevoCorreo);
        this.saveUsuario(usuario);
    }
}

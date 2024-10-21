package com.api.backendtesteeureka.service;

import com.api.backendtesteeureka.model.Usuario;
import com.api.backendtesteeureka.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Object save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> carregar() {
        return usuarioRepository.findAll();
    }
}

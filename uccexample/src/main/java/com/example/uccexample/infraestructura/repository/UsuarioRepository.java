package com.example.uccexample.infraestructura.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.uccexample.infraestructura.crud.UsuarioCrud;
import com.example.uccexample.infraestructura.model.Usuario;

@Repository
public class UsuarioRepository {

    private final UsuarioCrud usuarioCrud;

    public UsuarioRepository(UsuarioCrud usuarioCrud) {
        this.usuarioCrud = usuarioCrud;
    }

    public Optional<Usuario> findByUsername(String username) {
        return usuarioCrud.findByUsername(username);
    }

    public Usuario save(Usuario usuario) {
        return usuarioCrud.save(usuario);
    }
    
}

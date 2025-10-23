package com.example.uccexample.infraestructura.crud;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.uccexample.infraestructura.model.Usuario;

public interface UsuarioCrud extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}

package com.example.uccexample.infraestructura.crud;

import org.springframework.data.repository.CrudRepository;

import com.example.uccexample.infraestructura.model.Cancha;

public interface CanchaCrud extends CrudRepository<Cancha, Long> {
}

package com.example.uccexample.infraestructura.crud;

import org.springframework.data.repository.CrudRepository;

import com.example.uccexample.infraestructura.model.Cliente;


public interface ClienteCrud extends CrudRepository<Cliente, Long> {
    
}

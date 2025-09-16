package com.example.uccexample.infraestructura.crud;

import com.example.uccexample.model.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}

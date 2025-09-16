package com.example.uccexample.Controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uccexample.infraestructura.crud.ClienteRepository;
import com.example.uccexample.model.Cliente;

@RestController

public class HolaController {

    private ClienteRepository clienteRepository;

    public HolaController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/")
    public List<Cliente> getAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }
    
}
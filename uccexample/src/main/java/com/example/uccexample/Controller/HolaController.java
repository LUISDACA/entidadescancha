package com.example.uccexample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uccexample.domain.dto.ClientDTO;
import com.example.uccexample.infraestructura.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes") // 👈 Ruta base limpia, el context-path añade /ucc/api
public class Holacontroller {

    @Autowired
    private ClienteRepository clienteRepository;

    // GET -> obtener todos los clientes
    @GetMapping
    public List<ClientDTO> getAll() {
        return clienteRepository.getAll();
    }

    // GET -> buscar un cliente por id
    @GetMapping("/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return clienteRepository.findById(id);
    }

    // POST -> guardar un nuevo cliente
    @PostMapping
    public ClientDTO save(@RequestBody ClientDTO clientDto) {
        return clienteRepository.save(clientDto);
    }

    // DELETE -> eliminar un cliente por id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ClientDTO client = clienteRepository.findById(id);
        if (client != null) {
            clienteRepository.delete(client);
        }
    }
}

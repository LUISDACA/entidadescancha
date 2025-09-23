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

import com.example.uccexample.domain.dto.CourtDTO;
import com.example.uccexample.infraestructura.repository.CanchaRepository;

@RestController
@RequestMapping("/canchas") // 👈 Ruta base limpia, el context-path añade /ucc/api
public class CanchaController {

    @Autowired
    private CanchaRepository canchaRepository;

    // GET -> obtener todas las canchas
    @GetMapping
    public List<CourtDTO> getAll() {
        return canchaRepository.getAll();
    }

    // GET -> buscar una cancha por id
    @GetMapping("/{id}")
    public CourtDTO findById(@PathVariable Long id) {
        return canchaRepository.findById(id);
    }

    // POST -> guardar una nueva cancha
    @PostMapping
    public CourtDTO save(@RequestBody CourtDTO courtDto) {
        return canchaRepository.save(courtDto);
    }

    // DELETE -> eliminar una cancha por id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        CourtDTO court = canchaRepository.findById(id);
        if (court != null) {
            canchaRepository.delete(court);
        }
    }
}

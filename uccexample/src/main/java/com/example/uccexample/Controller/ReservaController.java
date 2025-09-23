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

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.infraestructura.repository.ReservaRepository;

@RestController
@RequestMapping("/reservas") // 👈 Ruta base, el context-path añade /ucc/api
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    // GET -> obtener todas las reservas
    @GetMapping
    public List<ReservationDTO> getAll() {
        return reservaRepository.getAll();
    }

    // GET -> buscar una reserva por id
    @GetMapping("/{id}")
    public ReservationDTO findById(@PathVariable Long id) {
        return reservaRepository.findById(id);
    }

    // POST -> guardar una nueva reserva
    @PostMapping
    public ReservationDTO save(@RequestBody ReservationDTO reservaDto) {
        return reservaRepository.save(reservaDto);
    }

    // DELETE -> eliminar una reserva por id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ReservationDTO reserva = reservaRepository.findById(id);
        if (reserva != null) {
            reservaRepository.delete(reserva);
        }
    }
}

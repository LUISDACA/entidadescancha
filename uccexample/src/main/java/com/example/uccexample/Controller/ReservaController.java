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
import com.example.uccexample.domain.service.ReservaService;

@RestController
@RequestMapping("/reservas") // 👈 Ruta base, el context-path añade /ucc/api
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    // GET -> obtener todas las reservas
    @GetMapping
    public List<ReservationDTO> getAll() {
        return reservaService.getAll();
    }

    // GET -> buscar una reserva por id
    @GetMapping("/{id}")
    public ReservationDTO findById(@PathVariable Long id) {
        return reservaService.findById(id);
    }

    // POST -> guardar una nueva reserva
    @PostMapping
    public ReservationDTO save(@RequestBody ReservationDTO reservaDto) {
        return reservaService.save(reservaDto);
    }

    // DELETE -> eliminar una reserva por id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ReservationDTO reserva = reservaService.findById(id);
        if (reserva != null) {
            reservaService.delete(id);
        }
    }
}

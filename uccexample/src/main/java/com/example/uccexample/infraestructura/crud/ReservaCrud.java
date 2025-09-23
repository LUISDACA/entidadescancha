package com.example.uccexample.infraestructura.crud;

import org.springframework.data.repository.CrudRepository;

import com.example.uccexample.infraestructura.model.Reserva;

public interface ReservaCrud extends CrudRepository<Reserva, Long> {
}

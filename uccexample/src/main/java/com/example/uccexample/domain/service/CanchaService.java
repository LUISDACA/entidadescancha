package com.example.uccexample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uccexample.domain.dto.CourtDTO;
import com.example.uccexample.infraestructura.repository.CanchaRepository;

@Service
public class CanchaService {

    @Autowired
    private CanchaRepository canchaRepository;

    public List<CourtDTO> getAll() {
        return canchaRepository.getAll();
    }

    public CourtDTO findById(Long id) {
        return canchaRepository.findById(id);
    }

    public CourtDTO save(CourtDTO courtDto) {
        return canchaRepository.save(courtDto);
    }

    public void delete(Long id) {
        CourtDTO court = canchaRepository.findById(id);
        if (court != null) {
            canchaRepository.delete(court);
        }
    }
}
package com.example.uccexample.domain.irepository;

import java.util.List;

import com.example.uccexample.domain.dto.CourtDTO;

public interface ICanchaRepository {
    List<CourtDTO> getAll();
    CourtDTO findById(Long id);
    CourtDTO save(CourtDTO courtDto);
    void delete(CourtDTO courtDto);
}

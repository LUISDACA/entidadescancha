package com.example.uccexample.infraestructura.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.uccexample.domain.dto.CourtDTO;
import com.example.uccexample.domain.irepository.ICanchaRepository;
import com.example.uccexample.infraestructura.crud.CanchaCrud;
import com.example.uccexample.infraestructura.mapper.CanchaMapper;
import com.example.uccexample.infraestructura.model.Cancha;

@Repository
public class CanchaRepository implements ICanchaRepository {

    @Autowired
    private CanchaCrud canchaCrud;

    @Autowired
    private CanchaMapper canchaMapper;

    @Override
    public List<CourtDTO> getAll() {
        List<Cancha> canchas = (List<Cancha>) canchaCrud.findAll();
        return canchaMapper.toCourtDTOs(canchas);
    }

    @Override
    public CourtDTO findById(Long id) {
        Optional<Cancha> cancha = canchaCrud.findById(id);
        return cancha.map(c -> canchaMapper.toCourtDTO(c)).orElse(null);
    }

    @Override
    public CourtDTO save(CourtDTO courtDto) {
        Cancha cancha = canchaMapper.toCancha(courtDto);
        return canchaMapper.toCourtDTO(canchaCrud.save(cancha));
    }

    @Override
    public void delete(CourtDTO courtDto) {
        Cancha cancha = canchaMapper.toCancha(courtDto);
        canchaCrud.delete(cancha);
    }
}

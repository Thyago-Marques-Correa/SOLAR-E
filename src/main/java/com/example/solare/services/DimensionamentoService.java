package com.example.solare.services;

import com.example.solare.models.Dimensionamento;
import com.example.solare.repositories.DimensionamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DimensionamentoService {

    @Autowired
    private DimensionamentoRepository dimensionamentoRepository;

    public List<Dimensionamento> findAll() {
        return dimensionamentoRepository.findAll();
    }

    public Optional<Dimensionamento> findById(Integer id) {
        return dimensionamentoRepository.findById(id);
    }

    public Dimensionamento save(Dimensionamento dimensionamento) {
        return dimensionamentoRepository.save(dimensionamento);
    }

    public void deleteById(Integer id) {
        dimensionamentoRepository.deleteById(id);
    }
}

package com.example.solare.services;

import com.example.solare.models.ModuloFotovoltaico;
import com.example.solare.repositories.ModuloFotovoltaicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloFotovoltaicoService {

    @Autowired
    private ModuloFotovoltaicoRepository repository;

    public List<ModuloFotovoltaico> findAll() {
        return repository.findAll();
    }

    public Optional<ModuloFotovoltaico> findById(Integer id) {
        return repository.findById(id);
    }

    public ModuloFotovoltaico save(ModuloFotovoltaico moduloFotovoltaico) {
        return repository.save(moduloFotovoltaico);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}

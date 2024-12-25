package com.example.solare.services;

import com.example.solare.models.Lojista;
import com.example.solare.repositories.LojistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LojistaService {

    @Autowired
    private LojistaRepository repository;

    public List<Lojista> findAll() {
        return repository.findAll();
    }

    public Optional<Lojista> findById(Integer id) {
        return repository.findById(id);
    }

    public Lojista save(Lojista lojista) {
        return repository.save(lojista);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}

package com.example.solare.controllers;

import com.example.solare.models.Lojista;
import com.example.solare.services.LojistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/lojistas")
public class LojistaController {

    @Autowired
    private LojistaService service;

    @GetMapping
    public ResponseEntity<List<Lojista>> getAll() {
        List<Lojista> lojistas = service.findAll();
        return ResponseEntity.ok(lojistas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lojista> getById(@PathVariable Integer id) {
        Optional<Lojista> lojista = service.findById(id);
        return lojista.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Lojista> create(@RequestBody Lojista lojista) {
        Lojista savedLojista = service.save(lojista);
        return ResponseEntity.ok(savedLojista);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lojista> update(@PathVariable Integer id, @RequestBody Lojista updatedLojista) {
        Optional<Lojista> optionalLojista = service.findById(id);
        if (optionalLojista.isPresent()) {
            Lojista lojista = optionalLojista.get();
            lojista.setCliente(updatedLojista.getCliente());
            lojista.setCnpj(updatedLojista.getCnpj());
            lojista.setDataCadastro(updatedLojista.getDataCadastro());
            Lojista savedLojista = service.save(lojista);
            return ResponseEntity.ok(savedLojista);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

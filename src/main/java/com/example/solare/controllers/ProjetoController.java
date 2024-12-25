package com.example.solare.controllers;

import com.example.solare.models.Projeto;
import com.example.solare.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public ResponseEntity<List<Projeto>> getAll() {
        List<Projeto> projetos = projetoService.findAll();
        return ResponseEntity.ok(projetos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projeto> getById(@PathVariable Integer id) {
        Optional<Projeto> projeto = projetoService.findById(id);
        return projeto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Projeto> create(@RequestBody Projeto projeto) {
        Projeto savedProjeto = projetoService.save(projeto);
        return ResponseEntity.ok(savedProjeto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Projeto> update(@PathVariable Integer id, @RequestBody Projeto updatedProjeto) {
        Optional<Projeto> optionalProjeto = projetoService.findById(id);
        if (optionalProjeto.isPresent()) {
            Projeto projeto = optionalProjeto.get();
            projeto.setStatus(updatedProjeto.getStatus());
            projeto.setPayback(updatedProjeto.getPayback());
            projeto.setCliente(updatedProjeto.getCliente());
            Projeto savedProjeto = projetoService.save(projeto);
            return ResponseEntity.ok(savedProjeto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        projetoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

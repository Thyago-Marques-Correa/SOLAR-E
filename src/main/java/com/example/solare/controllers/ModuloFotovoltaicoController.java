package com.example.solare.controllers;

import com.example.solare.models.ModuloFotovoltaico;
import com.example.solare.services.ModuloFotovoltaicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/modulos-fotovoltaicos")
public class ModuloFotovoltaicoController {

    @Autowired
    private ModuloFotovoltaicoService service;

    @GetMapping
    public ResponseEntity<List<ModuloFotovoltaico>> getAll() {
        List<ModuloFotovoltaico> modulos = service.findAll();
        return ResponseEntity.ok(modulos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModuloFotovoltaico> getById(@PathVariable Integer id) {
        Optional<ModuloFotovoltaico> modulo = service.findById(id);
        return modulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ModuloFotovoltaico> create(@RequestBody ModuloFotovoltaico moduloFotovoltaico) {
        ModuloFotovoltaico savedModulo = service.save(moduloFotovoltaico);
        return ResponseEntity.ok(savedModulo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModuloFotovoltaico> update(@PathVariable Integer id, @RequestBody ModuloFotovoltaico updatedModulo) {
        Optional<ModuloFotovoltaico> optionalModulo = service.findById(id);
        if (optionalModulo.isPresent()) {
            ModuloFotovoltaico modulo = optionalModulo.get();
            modulo.setProduto(updatedModulo.getProduto());
            modulo.setTipo(updatedModulo.getTipo());
            modulo.setPotenciaNominal(updatedModulo.getPotenciaNominal());
            modulo.setEficiencia(updatedModulo.getEficiencia());
            modulo.setArea(updatedModulo.getArea());
            modulo.setCorrenteIsc(updatedModulo.getCorrenteIsc());
            modulo.setTensaoVoc(updatedModulo.getTensaoVoc());
            ModuloFotovoltaico savedModulo = service.save(modulo);
            return ResponseEntity.ok(savedModulo);
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

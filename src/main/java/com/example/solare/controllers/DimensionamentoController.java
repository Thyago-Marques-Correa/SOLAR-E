package com.example.solare.controllers;

import com.example.solare.models.Dimensionamento;
import com.example.solare.services.DimensionamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dimensionamentos")
public class DimensionamentoController {

    @Autowired
    private DimensionamentoService dimensionamentoService;

    @GetMapping
    public ResponseEntity<List<Dimensionamento>> getAll() {
        List<Dimensionamento> dimensionamentos = dimensionamentoService.findAll();
        return ResponseEntity.ok(dimensionamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dimensionamento> getById(@PathVariable Integer id) {
        Optional<Dimensionamento> dimensionamento = dimensionamentoService.findById(id);
        return dimensionamento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Dimensionamento> create(@RequestBody Dimensionamento dimensionamento) {
        Dimensionamento savedDimensionamento = dimensionamentoService.save(dimensionamento);
        return ResponseEntity.ok(savedDimensionamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dimensionamento> update(@PathVariable Integer id, @RequestBody Dimensionamento updatedDimensionamento) {
        Optional<Dimensionamento> optionalDimensionamento = dimensionamentoService.findById(id);
        if (optionalDimensionamento.isPresent()) {
            Dimensionamento dimensionamento = optionalDimensionamento.get();
            dimensionamento.setEndereco(updatedDimensionamento.getEndereco());
            dimensionamento.setAreaConstrucao(updatedDimensionamento.getAreaConstrucao());
            dimensionamento.setMediaConsumoMensal(updatedDimensionamento.getMediaConsumoMensal());
            dimensionamento.setProducaoMensal(updatedDimensionamento.getProducaoMensal());
            dimensionamento.setValorImplantacao(updatedDimensionamento.getValorImplantacao());
            Dimensionamento savedDimensionamento = dimensionamentoService.save(dimensionamento);
            return ResponseEntity.ok(savedDimensionamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        dimensionamentoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

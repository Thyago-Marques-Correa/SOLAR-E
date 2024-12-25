package com.example.solare.controllers;

import com.example.solare.models.Payback;
import com.example.solare.services.PaybackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paybacks")
public class PaybackController {

    @Autowired
    private PaybackService paybackService;

    @GetMapping
    public ResponseEntity<List<Payback>> getAll() {
        List<Payback> paybacks = paybackService.findAll();
        return ResponseEntity.ok(paybacks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payback> getById(@PathVariable Integer id) {
        Optional<Payback> payback = paybackService.findById(id);
        return payback.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Payback> create(@RequestBody Payback payback) {
        Payback savedPayback = paybackService.save(payback);
        return ResponseEntity.ok(savedPayback);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Payback> update(@PathVariable Integer id, @RequestBody Payback updatedPayback) {
        Optional<Payback> optionalPayback = paybackService.findById(id);
        if (optionalPayback.isPresent()) {
            Payback payback = optionalPayback.get();
            payback.setTaxaMedia10AnosSelic(updatedPayback.getTaxaMedia10AnosSelic());
            payback.setValorImplantacao(updatedPayback.getValorImplantacao());
            payback.setRendimentosSelic(updatedPayback.getRendimentosSelic());
            payback.setMediaGastoMensal(updatedPayback.getMediaGastoMensal());
            payback.setTempoParaLucro(updatedPayback.getTempoParaLucro());
            payback.setDimensionamento(updatedPayback.getDimensionamento());
            Payback savedPayback = paybackService.save(payback);
            return ResponseEntity.ok(savedPayback);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        paybackService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

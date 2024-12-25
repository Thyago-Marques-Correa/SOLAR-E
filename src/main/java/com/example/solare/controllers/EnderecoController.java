package com.example.solare.controllers;

import com.example.solare.dto.EnderecoDTO;
import com.example.solare.models.Endereco;
import com.example.solare.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<List<Endereco>> getAll() {
        List<Endereco> enderecos = enderecoService.findAll();
        return ResponseEntity.ok(enderecos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> getById(@PathVariable Integer id) {
        Optional<Endereco> endereco = enderecoService.findById(id);
        return endereco.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Endereco> create(@RequestBody Endereco endereco) {
        Endereco savedEndereco = enderecoService.save(endereco);
        return ResponseEntity.ok(savedEndereco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Endereco> update(@PathVariable Integer id, @RequestBody Endereco updatedEndereco) {
        Optional<Endereco> optionalEndereco = enderecoService.findById(id);
        if (optionalEndereco.isPresent()) {
            Endereco endereco = optionalEndereco.get();
            endereco.setCep(updatedEndereco.getCep());
            endereco.setLogradouro(updatedEndereco.getLogradouro());
            endereco.setNumero(updatedEndereco.getNumero());
            endereco.setComplemento(updatedEndereco.getComplemento());
            endereco.setBairro(updatedEndereco.getBairro());
            endereco.setCidade(updatedEndereco.getCidade());
            endereco.setEstado(updatedEndereco.getEstado());
            endereco.setPais(updatedEndereco.getPais());
            Endereco savedEndereco = enderecoService.save(endereco);
            return ResponseEntity.ok(savedEndereco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        enderecoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

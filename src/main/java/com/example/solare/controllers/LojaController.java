/*package com.example.solare.controllers;

import com.example.solare.dto.LojaDTO;
import com.example.solare.services.LojaService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/lojas", produces = MediaType.APPLICATION_JSON_VALUE)
public class LojaController {
    @Autowired
    private LojaService lojaService;

    @GetMapping("/cadastroLoja")
    public String cadastroLoja() {
        return "cadastroLoja";
    }

    @GetMapping("/cadastroProdutos")
    public String cadastroProdutos() {
        return "cadastroProdutos";
    }

    @PostMapping
    public ResponseEntity<LojaDTO> create(@RequestBody LojaDTO lojaDTO) {
        LojaDTO createdLoja = lojaService.create(lojaDTO);
        return ResponseEntity.ok(createdLoja);
    }

    @PutMapping("/{lojaId}")
    public ResponseEntity<LojaDTO> update(@PathVariable("lojaId") Long lojaId, @RequestBody LojaDTO lojaDTO) {
        LojaDTO updatedLoja = lojaService.update(lojaId, lojaDTO);
        return ResponseEntity.ok(updatedLoja);
    }

    @GetMapping
    public ResponseEntity<List<LojaDTO>> getAll() {
        List<LojaDTO> lojas = lojaService.getAll();
        return ResponseEntity.ok(lojas);
    }

    @GetMapping("/{lojaId}")
    public ResponseEntity<LojaDTO> getById(@PathVariable("lojaId") Long lojaId) {
        LojaDTO loja = lojaService.getById(lojaId);
        return ResponseEntity.ok(loja);
    }

    @DeleteMapping("/{lojaId}")
    public ResponseEntity<String> delete(@PathVariable("lojaId") Long lojaId) {
        String lojaDeletado = lojaService.delete(lojaId);
        return ResponseEntity.ok(lojaDeletado);
    }
}
*/
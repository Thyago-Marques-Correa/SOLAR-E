package com.example.solare.controllers;

import com.example.solare.dto.TecnicoDTO;
import com.example.solare.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/tecnicos", produces = MediaType.APPLICATION_JSON_VALUE)
public class TecnicoController {
    @Autowired
    private TecnicoService tecnicoService;

    @GetMapping("/cadastroTecnico")
    public String cadastroTecnico() {
        return "cadastroTecnico";
    }

    @PostMapping
    public ResponseEntity<TecnicoDTO> create(@RequestBody TecnicoDTO tecnicoDTO) {
        TecnicoDTO createdTecnico = tecnicoService.create(tecnicoDTO);
        return ResponseEntity.ok(createdTecnico);
    }

    @PutMapping("/{tecnicoId}")
    public ResponseEntity<TecnicoDTO> update(@PathVariable("tecnicoId") Long tecnicoId, @RequestBody TecnicoDTO tecnicoDTO) {
        TecnicoDTO updatedTecnico = tecnicoService.update(tecnicoId, tecnicoDTO);
        return ResponseEntity.ok(updatedTecnico);
    }

    @GetMapping
    public ResponseEntity<List<TecnicoDTO>> getAll() {
        List<TecnicoDTO> tecnicos = tecnicoService.getAll();
        return ResponseEntity.ok(tecnicos);
    }

    @GetMapping("/{tecnicoId}")
    public ResponseEntity<TecnicoDTO> getById(@PathVariable("tecnicoId") Long tecnicoId) {
        TecnicoDTO tecnico = tecnicoService.getById(tecnicoId);
        return ResponseEntity.ok(tecnico);
    }

    @DeleteMapping("/{tecnicoId}")
    public ResponseEntity<String> delete(@PathVariable("tecnicoId") Long tecnicoId) {
        String tecnicoDeletado = tecnicoService.delete(tecnicoId);
        return ResponseEntity.ok(tecnicoDeletado);
    }
}

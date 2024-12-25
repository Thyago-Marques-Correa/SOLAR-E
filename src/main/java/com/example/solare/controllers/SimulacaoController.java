package com.example.solare.controllers;

import com.example.solare.dto.SimulacaoDTO;
import com.example.solare.services.SimulacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Simulacao")
public class SimulacaoController {
    @Autowired
    private SimulacaoService simulacaoService;

    @PostMapping("/Create")
    public ResponseEntity<String> criarSimulacao(@RequestBody SimulacaoDTO simulacaoDTO) {
        try {
            simulacaoService.salvarSimulacao(simulacaoDTO);
            return ResponseEntity.ok("Simulação criada com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao criar simulação.");
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<SimulacaoDTO>> listarSimulacoes() {
        try {
            List<SimulacaoDTO> simulacoes = simulacaoService.listarSimulacoes();
            return ResponseEntity.ok(simulacoes);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletarSimulacao(@PathVariable Long id) {
        try {
            if (id == null || id <= 0) {
                return ResponseEntity.status(400).body("ID inválido.");
            }
    
            simulacaoService.deletarSimulacao(id);
            return ResponseEntity.ok("Simulação excluída com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(400).body("Erro ao excluir simulação.");
        }
    }
    

    @GetMapping("/relatorio/{id}")
    public ResponseEntity<SimulacaoDTO> exibirRelatorio(@PathVariable Long id) {
        try {
            SimulacaoDTO relatorio = simulacaoService.gerarRelatorio(id);
            return ResponseEntity.ok(relatorio);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> atualizarSimulacao(@PathVariable Long id, @RequestBody SimulacaoDTO simulacaoDTO) {
        try {
            simulacaoService.atualizarSimulacao(id, simulacaoDTO);
            return ResponseEntity.ok("Simulação atualizada com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao atualizar simulação.");
        }
    }

}

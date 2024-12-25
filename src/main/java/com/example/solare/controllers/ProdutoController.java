package com.example.solare.controllers;

import com.example.solare.dto.ProdutoDTO;
import com.example.solare.services.ProdutoService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/cadastroProduto")
    public String cadastroProduto() {
        return "cadastroProduto";
    }

    @GetMapping("/cadastroProdutos")
    public String cadastroProdutos() {
        return "cadastroProdutos";
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> create(@RequestBody ProdutoDTO produtoDTO) {
        ProdutoDTO createdProduto = produtoService.create(produtoDTO);
        return ResponseEntity.ok(createdProduto);
    }

    @PutMapping("/{produtoId}")
    public ResponseEntity<ProdutoDTO> update(@PathVariable("produtoId") Long produtoId, @RequestBody ProdutoDTO produtoDTO) {
        ProdutoDTO updatedProduto = produtoService.update(produtoId, produtoDTO);
        return ResponseEntity.ok(updatedProduto);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> getAll() {
        List<ProdutoDTO> produtos = produtoService.getAll();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{produtoId}")
    public ResponseEntity<ProdutoDTO> getById(@PathVariable("produtoId") Long produtoId) {
        ProdutoDTO produto = produtoService.getById(produtoId);
        return ResponseEntity.ok(produto);
    }

    @DeleteMapping("/{produtoId}")
    public ResponseEntity<String> delete(@PathVariable("produtoId") Long produtoId) {
        String produtoDeletado = produtoService.delete(produtoId);
        return ResponseEntity.ok(produtoDeletado);
    }
}
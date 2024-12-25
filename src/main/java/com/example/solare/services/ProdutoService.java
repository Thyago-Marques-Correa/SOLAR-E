package com.example.solare.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.solare.dto.ProdutoDTO;
import com.example.solare.models.Produto;
import com.example.solare.repositories.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    private void configurarProduto(Produto produto, ProdutoDTO produtoDTO) {
        produto.setNome(produtoDTO.getNome());
        produto.setMarca(produtoDTO.getMarca());
        produto.setCategoria(produtoDTO.getCategoria());
        produto.setDimensao(produtoDTO.getDimensao());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setPotencia(produtoDTO.getPotencia());
        produto.setValor(produtoDTO.getValor());
        produto.setQuantidade(produtoDTO.getQuantidade());
    }

    public ProdutoDTO create(ProdutoDTO ProdutoDTO){
        Produto produto = new Produto();
        configurarProduto(produto, ProdutoDTO);
        repository.save(produto);
        ProdutoDTO.setId(produto.getId());
        return ProdutoDTO;
    }

    public ProdutoDTO update(Long produtoId, ProdutoDTO produtoDTO) {
        Produto produto = repository.findById(produtoId)
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrada com ID: " + produtoId));

        configurarProduto(produto, produtoDTO);
        repository.save(produto);
        produtoDTO.setId(produto.getId());
        return produtoDTO;
    }

    private ProdutoDTO mapearProduto(Produto produto) {
        ProdutoDTO produtoMap = new ProdutoDTO();
        produtoMap.setId(produto.getId());
        produtoMap.setNome(produto.getNome());
        produtoMap.setMarca(produto.getMarca());
        produtoMap.setCategoria(produto.getCategoria());
        produtoMap.setDimensao(produto.getDimensao());
        produtoMap.setDescricao(produto.getDescricao());
        produtoMap.setPotencia(produto.getPotencia());
        produtoMap.setValor(produto.getValor());
        produtoMap.setQuantidade(produto.getQuantidade());

        return produtoMap;
    }

    public List<ProdutoDTO> getAll() {
        return repository.findAll().stream().map(this::mapearProduto).collect(Collectors.toList());
    }

    public ProdutoDTO getById(Long produtoId){
        Produto produtoRecuperado = repository.findById(produtoId)
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrada com ID: " + produtoId));

        return mapearProduto(produtoRecuperado);
    }

    public String delete(Long produtoId){
        repository.deleteById(produtoId);
        return "Produto deletada com sucesso!";
    }

}

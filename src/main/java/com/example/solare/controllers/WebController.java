package com.example.solare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/SimularProjeto.html")
    public String showSimularProjeto() {
        return "SimularProjeto";
    }

    @GetMapping("/ListaFornecedores.html")
    public String showListaFornecedores() {
        return "ListaFornecedores";
    }

    @GetMapping("/NovaSimulacao.html")
    public String showNovaSimulacao() {
        return "NovaSimulacao";
    }

    @GetMapping("/RelatorioSimulacao.html")
    public String showRelatorioSimulacao(){
        return "RelatorioSimulacao";
    }

    @GetMapping("/NovoFornecedor.html")
    public String showNovoFornecedor(){
        return "NovoFornecedor";
    }

    @GetMapping("/NovoProduto.html")
    public String showNovoProduto(){
        return "NovoProduto";
    }

    @GetMapping("/ListaProdutos.html")
    public String showListaProdutos(){
        return "ListaProdutos";
    }

    @GetMapping("/Contato.html")
    public String showContato(){
        return "Contato";
    }

    @GetMapping("/DetalhesContato.html")
    public String showDetalhesContato(){
        return "DetalhesContato";
    }

    @GetMapping("/ListaContatos.html")
    public String showListaContatos(){
        return "ListaContatos";
    }

    @GetMapping("/index.html")
    public String showIndex(){
        return "index";
    }
}
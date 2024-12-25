package com.example.solare.models;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROD_ID")
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "MARCA", nullable = false)
    private String marca;
    
    @Column(name = "CATEGORIA", nullable = false)
    private String categoria;
    
    @Column(name = "DIMENSAO", nullable = false)
    private String dimensao; 

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "POTENCIA", nullable = false)
    private double potencia;
    
    @Column(name = "VALOR", nullable = false)
    private double valor;

    @Column(name = "QUANTIDADE", nullable = false)
    private int quantidade;

  //  @JoinColumn(name = "loja_id")
   // private Loja loja;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //public Loja getLoja() {
  //      return loja;
   // }

    //public void setLoja(Loja loja) {
   //     this.loja = loja;
   // }
}

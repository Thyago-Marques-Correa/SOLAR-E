package com.example.solare.models;

import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ENDERECO")
    private Integer id;

    @Column(name = "CEP", nullable = false)
    private Integer cep;

    @Column(name = "LOGRADOURO", length = 255, nullable = false)
    private String logradouro;

    @Column(name = "NUMERO", nullable = false)
    private Integer numero;

    @Column(name = "COMPLEMENTO", length = 255)
    private String complemento;

    @Column(name = "BAIRRO", length = 255, nullable = false)
    private String bairro;

    @Column(name = "CIDADE", length = 255, nullable = false)
    private String cidade;

    @Column(name = "ESTADO", length = 255, nullable = false)
    private String estado;

    @Column(name = "PAIS", length = 2, nullable = false)
    private String pais;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

package com.example.solare.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "lojista")
public class Lojista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_LOJISTA")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "COD_CLIENTE", nullable = false)
    private Cliente cliente;

    @Column(name = "CNPJ", nullable = false, unique = true, length = 20)
    private String cnpj;

    @Column(name = "DATA_CADASTRO", nullable = false)
    private LocalDate dataCadastro;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}

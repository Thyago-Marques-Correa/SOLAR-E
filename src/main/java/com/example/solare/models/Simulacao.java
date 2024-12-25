package com.example.solare.models;

import jakarta.persistence.*;

@Entity
@Table(name = "simulacao")
public class Simulacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "COD_CLIENTE", nullable = false)
    private Long clienteId;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "TIPO_PRODUTO", nullable = false)
    private Integer tipoProduto;

    @Column(name = "ORCAMENTO_MAXIMO", nullable = false)
    private Double orcamentoMaximo;

    @Column(name = "CONSUMO_MEDIO_MENSAL", nullable = false)
    private Double consumoMedioMensal;

    @Column(name = "VALOR_MEDIO_CONTA_ENERGIA", nullable = false)
    private Double valorMedioContaEnergia;

    @Column(name = "ANOS_PERMANENCIA", nullable = false)
    private Integer anosPermanencia;

    @Column(name = "ESPACO_TOTAL_INSTALACAO", nullable = false)
    private Double espacoTotalInstalacao;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(Integer tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Double getOrcamentoMaximo() {
        return orcamentoMaximo;
    }

    public void setOrcamentoMaximo(Double orcamentoMaximo) {
        this.orcamentoMaximo = orcamentoMaximo;
    }

    public Double getConsumoMedioMensal() {
        return consumoMedioMensal;
    }

    public void setConsumoMedioMensal(Double consumoMedioMensal) {
        this.consumoMedioMensal = consumoMedioMensal;
    }

    public Double getValorMedioContaEnergia() {
        return valorMedioContaEnergia;
    }

    public void setValorMedioContaEnergia(Double valorMedioContaEnergia) {
        this.valorMedioContaEnergia = valorMedioContaEnergia;
    }

    public Integer getAnosPermanencia() {
        return anosPermanencia;
    }

    public void setAnosPermanencia(Integer anosPermanencia) {
        this.anosPermanencia = anosPermanencia;
    }

    public Double getEspacoTotalInstalacao() {
        return espacoTotalInstalacao;
    }

    public void setEspacoTotalInstalacao(Double espacoTotalInstalacao) {
        this.espacoTotalInstalacao = espacoTotalInstalacao;
    }
}

package com.example.solare.models;

import jakarta.persistence.*;

@Entity
@Table(name = "payback")
public class Payback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_PAYBACK")
    private Integer id;

    @Column(name = "TAXA_MEDIA_10A_SELIC", nullable = false)
    private Integer taxaMedia10AnosSelic;

    @Column(name = "VALOR_IMPLANTACAO", nullable = false)
    private Integer valorImplantacao;

    @Column(name = "RENDIMENTOS_SELIC", nullable = false)
    private Integer rendimentosSelic;

    @Column(name = "MEDIA_GASTO_MENSAL", nullable = false)
    private Integer mediaGastoMensal;

    @Column(name = "TEMPO_PARA_LUCRO", nullable = false)
    private Integer tempoParaLucro;

    @OneToOne
    @JoinColumn(name = "COD_DIMENSIONAMENTO", nullable = false)
    private Dimensionamento dimensionamento;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaxaMedia10AnosSelic() {
        return taxaMedia10AnosSelic;
    }

    public void setTaxaMedia10AnosSelic(Integer taxaMedia10AnosSelic) {
        this.taxaMedia10AnosSelic = taxaMedia10AnosSelic;
    }

    public Integer getValorImplantacao() {
        return valorImplantacao;
    }

    public void setValorImplantacao(Integer valorImplantacao) {
        this.valorImplantacao = valorImplantacao;
    }

    public Integer getRendimentosSelic() {
        return rendimentosSelic;
    }

    public void setRendimentosSelic(Integer rendimentosSelic) {
        this.rendimentosSelic = rendimentosSelic;
    }

    public Integer getMediaGastoMensal() {
        return mediaGastoMensal;
    }

    public void setMediaGastoMensal(Integer mediaGastoMensal) {
        this.mediaGastoMensal = mediaGastoMensal;
    }

    public Integer getTempoParaLucro() {
        return tempoParaLucro;
    }

    public void setTempoParaLucro(Integer tempoParaLucro) {
        this.tempoParaLucro = tempoParaLucro;
    }

    public Dimensionamento getDimensionamento() {
        return dimensionamento;
    }

    public void setDimensionamento(Dimensionamento dimensionamento) {
        this.dimensionamento = dimensionamento;
    }
}

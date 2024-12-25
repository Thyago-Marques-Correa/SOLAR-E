package com.example.solare.dto;

public class PaybackDTO {
    private Integer id;
    private Integer taxaMedia10AnosSelic;
    private Integer valorImplantacao;
    private Integer rendimentosSelic;
    private Integer mediaGastoMensal;
    private Integer tempoParaLucro;
    private Integer dimensionamentoId;

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

    public Integer getDimensionamentoId() {
        return dimensionamentoId;
    }

    public void setDimensionamentoId(Integer dimensionamentoId) {
        this.dimensionamentoId = dimensionamentoId;
    }
}

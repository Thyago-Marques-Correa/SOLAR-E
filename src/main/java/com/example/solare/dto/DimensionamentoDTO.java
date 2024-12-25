package com.example.solare.dto;

public class DimensionamentoDTO {
    private Integer id;
    private Integer enderecoId;
    private Integer produtoDimensionamentoId;
    private Integer areaConstrucao;
    private Integer mediaConsumoMensal;
    private Integer producaoMensal;
    private Integer valorImplantacao;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }

    public Integer getProdutoDimensionamentoId() {
        return produtoDimensionamentoId;
    }

    public void setProdutoDimensionamentoId(Integer produtoDimensionamentoId) {
        this.produtoDimensionamentoId = produtoDimensionamentoId;
    }

    public Integer getAreaConstrucao() {
        return areaConstrucao;
    }

    public void setAreaConstrucao(Integer areaConstrucao) {
        this.areaConstrucao = areaConstrucao;
    }

    public Integer getMediaConsumoMensal() {
        return mediaConsumoMensal;
    }

    public void setMediaConsumoMensal(Integer mediaConsumoMensal) {
        this.mediaConsumoMensal = mediaConsumoMensal;
    }

    public Integer getProducaoMensal() {
        return producaoMensal;
    }

    public void setProducaoMensal(Integer producaoMensal) {
        this.producaoMensal = producaoMensal;
    }

    public Integer getValorImplantacao() {
        return valorImplantacao;
    }

    public void setValorImplantacao(Integer valorImplantacao) {
        this.valorImplantacao = valorImplantacao;
    }
}

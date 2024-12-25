package com.example.solare.dto;

public class ModuloFotovoltaicoDTO {
    private Integer id;
    private Integer produtoId;
    private String tipo;
    private Integer potenciaNominal;
    private Double eficiencia;
    private Integer area;
    private Integer correnteIsc;
    private Integer tensaoVoc;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPotenciaNominal() {
        return potenciaNominal;
    }

    public void setPotenciaNominal(Integer potenciaNominal) {
        this.potenciaNominal = potenciaNominal;
    }

    public Double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(Double eficiencia) {
        this.eficiencia = eficiencia;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getCorrenteIsc() {
        return correnteIsc;
    }

    public void setCorrenteIsc(Integer correnteIsc) {
        this.correnteIsc = correnteIsc;
    }

    public Integer getTensaoVoc() {
        return tensaoVoc;
    }

    public void setTensaoVoc(Integer tensaoVoc) {
        this.tensaoVoc = tensaoVoc;
    }
}

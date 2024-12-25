package com.example.solare.models;

import jakarta.persistence.*;

@Entity
@Table(name = "modulo_fotovoltaico")
public class ModuloFotovoltaico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_MODULO")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "COD_PRODUTO", nullable = false)
    private Produto produto;

    @Column(name = "TIPO", nullable = false, length = 1)
    private String tipo;

    @Column(name = "POTENCIA_NOMINAL", nullable = false)
    private Integer potenciaNominal;

    @Column(name = "EFICIENCIA", nullable = false)
    private Double eficiencia;

    @Column(name = "AREA", nullable = false)
    private Integer area;

    @Column(name = "CORRENTE_ISC", nullable = false)
    private Integer correnteIsc;

    @Column(name = "TENSAO_VOC", nullable = false)
    private Integer tensaoVoc;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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

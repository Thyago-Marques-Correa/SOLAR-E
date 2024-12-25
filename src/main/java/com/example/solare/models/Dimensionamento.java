package com.example.solare.models;

import jakarta.persistence.*;

@Entity
@Table(name = "dimensionamento")
public class Dimensionamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_CLIENTE")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "COD_ENDERECO", nullable = false)
    private Endereco endereco;

    @Column(name = "AREA_CONSTRUÇÃO", nullable = false)
    private Integer areaConstrucao;

    @Column(name = "MEDIA_CONSUMO_MENSAL", nullable = false)
    private Integer mediaConsumoMensal;

    @Column(name = "PRODUCAO_MENSAL", nullable = false)
    private Integer producaoMensal;

    @Column(name = "VALOR_IMPLANTACAO", nullable = false)
    private Integer valorImplantacao;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

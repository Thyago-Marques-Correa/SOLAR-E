package com.example.solare.dto;

public class SimulacaoDTO {
    private Long id;
    private Long clienteId;
    private String nome;
    private Integer tipoProduto;
    private Double orcamentoMaximo;
    private Double consumoMedioMensal;
    private Double valorMedioContaEnergia;
    private Integer anosPermanencia;
    private Double espacoTotalInstalacao;

    public Long getId(){
        return id;
    }
    public Long getClienteId() {
        return clienteId;
    }
    public String getNome() {
        return nome;
    }
    public Integer getTipoProduto() {
        return tipoProduto;
    }
    public Double getOrcamentoMaximo()  {
        return orcamentoMaximo;
    }
    public Double getConsumoMedioMensal() {
        return consumoMedioMensal;
    }
    public Double getValorMedioContaEnergia() {
        return valorMedioContaEnergia;
    }
    public Integer getAnosPermanencia() {
        return anosPermanencia;
    }
    public Double getEspacoTotalInstalacao() {
        return espacoTotalInstalacao;
    }
    public void setNome(String nome2) {
        this.nome = nome2;
    }
    public void setClienteId(Long clienteId2) {
        this.clienteId = clienteId2;
    }
    public void setId(Long id2){
        this.id = id2;
    }
    public void setTipoImovel(Integer tipo2){
        this.tipoProduto = tipo2;
    }
    public void setOrcamentoMaximo(Double orcamento){
        this.orcamentoMaximo = orcamento;
    }
    public void setConsumoMedioMensal(Double consumo){
        this.consumoMedioMensal = consumo;
    }
    public void setValorMedioContaEnergia(double valorMedio){
        this.valorMedioContaEnergia = valorMedio;
    }
    public void setAnosPermanencia(Integer anos){
        this.anosPermanencia = anos;
    }
    public void setEspacoTotalInstalacao(Double espaco){
        this.espacoTotalInstalacao = espaco;
    }
}

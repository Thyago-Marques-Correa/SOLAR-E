package com.example.solare.dto;

public class ProjetoDTO {
    private Integer id;
    private Boolean status;
    private Integer paybackId;
    private Integer clienteId;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getPaybackId() {
        return paybackId;
    }

    public void setPaybackId(Integer paybackId) {
        this.paybackId = paybackId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }
}

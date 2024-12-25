package com.example.solare.models;

import jakarta.persistence.*;

@Entity
@Table(name = "projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_PROJETO")
    private Integer id;

    @Column(name = "STATUS", nullable = false)
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "COD_PAYBACK", nullable = false)
    private Payback payback;

    @ManyToOne
    @JoinColumn(name = "COD_CLIENTE", nullable = false)
    private Cliente cliente;

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

    public Payback getPayback() {
        return payback;
    }

    public void setPayback(Payback payback) {
        this.payback = payback;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

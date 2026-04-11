package br.com.fiap.api_rest.model;

import java.time.LocalDate;
import java.util.List;

public class Pedido {

    private Long id;
    private String status;
    private LocalDate data;
    private List<Produto> produtos;
    private Double valor;

    public Pedido(Long id, String status, LocalDate data, List<Produto> produtos, Double valor) {
        this.id = id;
        this.status = status;
        this.data = data;
        this.produtos = produtos;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Double getValor() {
        return valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
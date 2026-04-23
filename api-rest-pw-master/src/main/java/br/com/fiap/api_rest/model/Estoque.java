package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_ESTOQUE")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "quantidade")
    private Integer quantidade;

    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public Estoque() {
    }

    public Estoque(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
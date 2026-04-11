package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_ENDERECOS")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cep")
    private String cep;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento,
                    String cidade, String bairro, String estado, String cep, Cliente cliente) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public Cliente getCliente() {
        return cliente;
    }

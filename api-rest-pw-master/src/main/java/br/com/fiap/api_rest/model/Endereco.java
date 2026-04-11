package br.com.fiap.api_rest.model;

public class Endereco {

    private Long id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String bairro;
    private String estado;
    private String cep;

    public Endereco(Long id, String logradouro, String numero, String complemento,
                    String cidade, String bairro, String estado, String cep) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
    }

    public Long getId() {
        return id;
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
}

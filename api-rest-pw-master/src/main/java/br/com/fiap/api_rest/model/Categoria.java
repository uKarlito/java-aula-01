package br.com.fiap.api_rest.model;

public enum Categoria {
    eletronicos ("Eletrônicos", "Dispositivos eletrônicos em geral"),
    vestuario ("Vestuário", "Roupas, calçados e acessórios de moda"),
    esporte ("Esportes", "Artigos esportivos e fitness"),
    moveis ("Móveis", "Móveis e decoração");

    private final String nome;
    private final String descricao;

    Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
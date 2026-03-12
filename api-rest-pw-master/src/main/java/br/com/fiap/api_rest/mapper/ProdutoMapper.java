package br.com.fiap.api_rest.mapper;

import br.com.fiap.api_rest.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {
    public ProdutoResponse produtoToResponse(Produto produto) {
        return ProdutoResponse(produto.getId(), produto.getNome(), produto.getPreco());
    }
}
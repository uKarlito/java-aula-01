package br.com.fiap.api_rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProdutoRequest(
        String nome,
        @DecimalMin(value = "0.99", message = "O valor mínimo deve ser 0.99")
        BigDecimal preco,
        LocalDate expiracao
) {
}

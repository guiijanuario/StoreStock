package com.catalisa.FullStackStock.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID do Produto", example = "1")
    private Long id;

    @Schema(description = "Nome do Produto", example = "Nome do Produto")
    private String nome;

    @Schema(description = "Descrição do Produto", example = "Sobre o produto")
    private String descricao;

    @Schema(description = "Valor do produto", example = "2,90")
    private BigDecimal preco;

    @Schema(description = "Quantidade de Estoque", example = "25")
    private int quantidadeEstoque;
}

package com.catalisa.FullStackStock.controller;

import com.catalisa.FullStackStock.model.ProdutoModel;
import com.catalisa.FullStackStock.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin(origins = "http://127.0.0.1:5500/")
@Tag(name = "API Produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    @Operation(summary = " : Lista todos os produtos", method = "GET")
    public List<ProdutoModel> listarProdutos() {
        return produtoService.listarProdutos();
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = " : Busca um produto pelo ID", method = "GET")
    public ResponseEntity<ProdutoModel> findById(@PathVariable Long id){
        ProdutoModel produto = produtoService.listarProdutoId(id);
        return ResponseEntity.ok().body(produto);
    }

    @PostMapping
    @Operation(summary = " : Cadastra um produto", method = "POST")
    public ProdutoModel cadastrarProduto(@RequestBody ProdutoModel produto) {
        return produtoService.cadastrarProduto(produto);
    }
}

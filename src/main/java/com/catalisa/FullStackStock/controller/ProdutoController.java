package com.catalisa.FullStackStock.controller;

import com.catalisa.FullStackStock.model.ProdutoModel;
import com.catalisa.FullStackStock.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class ProdutoController {


    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> listarProdutos() {
        return produtoService.listarProdutos();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProdutoModel> findById(@PathVariable Long id){
        ProdutoModel produto = produtoService.listarProdutoId(id);
        return ResponseEntity.ok().body(produto);
    }

    @PostMapping
    public ProdutoModel cadastrarProduto(@RequestBody ProdutoModel produto) {
        return produtoService.cadastrarProduto(produto);
    }
}

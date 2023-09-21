package com.catalisa.FullStackStock.service;


import com.catalisa.FullStackStock.model.ProdutoModel;
import com.catalisa.FullStackStock.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> listarProdutos(){
        return produtoRepository.findAll();
    }

    public ProdutoModel cadastrarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public ProdutoModel listarProdutoId (Long id){
        Optional<ProdutoModel> produto = produtoRepository.findById(id);
        return produtoRepository.getById(id);
    }

}

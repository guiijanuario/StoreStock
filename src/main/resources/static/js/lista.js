// Esta função preenche a tabela com os produtos obtidos da API.
function preencherTabelaProdutos(produtos) {
    const tabela = document.getElementById("produtoTableBody");
    tabela.innerHTML = "";

    produtos.forEach(produto => {
        const newRow = tabela.insertRow();
        newRow.innerHTML = `
            <td>${produto.id}</td>
            <td>${produto.nome}</td>
            <td>${produto.descricao}</td>
            <td>${produto.preco}</td>
            <td>${produto.quantidadeEstoque}</td>
        `;
    });
}

// Realize a requisição GET para obter a lista de produtos
fetch('http://localhost:8080/api/produtos')
    .then(response => response.json())
    .then(data => {
        preencherTabelaProdutos(data);
    })
    .catch(error => {
        console.error('Erro ao obter a lista de produtos:', error);
    });

// cadastro.js
function formatarNumeroComVirgula(numero) {
    return numero.toLocaleString('pt-BR', { minimumFractionDigits: 2, maximumFractionDigits: 2 });
}

document.getElementById("cadastroForm").addEventListener("submit", function (event) {
    event.preventDefault();

    const nome = document.getElementById("nome").value;
    const descricao = document.getElementById("descricao").value;
    
    const preco = parseFloat(document.getElementById("preco").value.replace(',', '.')); 
    
    const quantidadeEstoque = parseInt(document.getElementById("quantidade").value);

    const novoProduto = {
        nome: nome,
        descricao: descricao,
        preco: preco,
        quantidadeEstoque: quantidadeEstoque
    };

    fetch('http://localhost:8080/api/produtos', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(novoProduto)
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById("cadastroForm").reset();
        alert('Produto cadastrado com sucesso!');
    })
    .catch(error => {
        console.error('Erro ao cadastrar o produto:', error);
    });
});

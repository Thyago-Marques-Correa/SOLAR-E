document.querySelector('form').addEventListener('submit', function (event) {
    event.preventDefault();

    const data = {
        clienteId: document.getElementById('ClienteId').value,
        nome: document.getElementById('Nome').value,
        tipoProduto: document.querySelector('input[name="TipoProduto"]:checked').value,
        orcamentoMaximo: document.getElementById('OrcamentoMaximo').value,
        consumoMedioMensal: document.getElementById('ConsumoMedioMensal').value,
        valorMedioContaEnergia: document.getElementById('ValorMedioContaEnergia').value,
        anosPermanencia: document.getElementById('AnosPermanencia').value,
        espacoTotalInstalacao: document.getElementById('EspacoTotalInstalacao').value
    };

    fetch('/Simulacao/Create', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
        .then(response => {
            if (response.ok) {
                alert('Simulação cadastrada com sucesso!');
                window.location.href = '';
            } else {
                response.text().then(error => alert('Erro: ' + error));
            }
        })
        .catch(err => console.error('Erro ao cadastrar simulação:', err));
});

document.getElementById("botao").addEventListener('click', () =>{
    const cep = document.getElementById("cep").value.trim()

    if (cep.length !== 8 || isNaN(cep)) {
        alert("CEP inválido");
        document.getElementById("cep").innerHTML = '';
        return; 
    }

    fetch(`https://viacep.com.br/ws/${cep}/json/`).then(Response => Response.json())
    .then(data =>{
        document.getElementById('resultado').innerText = "Resultado:";
        document.getElementById('logradouro').innerText = `Logradouro: ${data.logradouro}`;
        document.getElementById('bairro').innerText = `Bairro: ${data.bairro}`;
        document.getElementById('cidade').innerText = `Cidade: ${data.localidade}`;
        document.getElementById('estado').innerText = `Estado: ${data.estado} - ${data.uf}`;
    })
})

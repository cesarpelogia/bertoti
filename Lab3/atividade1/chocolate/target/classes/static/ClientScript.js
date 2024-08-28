document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    const submitButton = form.querySelector('button[type="submit"]');
    const fields = form.querySelectorAll('input, select');
    const resultadoDiv = document.getElementById('resultado');

    submitButton.addEventListener('click', function(event) {
        event.preventDefault();
        let isValid = true;
        const newClient = {};

        // Limpar mensagens de erro anteriores
        fields.forEach(field => {
            const errorMessage = field.nextElementSibling;
            if (errorMessage && errorMessage.classList.contains('error-message')) {
                errorMessage.remove();
            }
        });

        // Validar campos e coletar dados
        fields.forEach(field => {
            if (!field.value) {
                isValid = false;
                const message = field.tagName === 'SELECT' ? 'Por favor, escolha uma opção.' : 'Por favor, preencha este campo.';
                const errorElement = document.createElement('div');
                errorElement.classList.add('error-message');
                errorElement.style.color = 'red';
                errorElement.textContent = message;
                field.insertAdjacentElement('afterend', errorElement);
            } else {
                newClient[field.name] = field.value;
            }
        });

        if (isValid) {
            // Exibir dados na tela
            resultadoDiv.innerHTML = '';
            for (const key in newClient) {
                const p = document.createElement('p');
                p.textContent = `${key}: ${newClient[key]}`;
                resultadoDiv.appendChild(p);
            }
            console.log('Form Data:', newClient);

            // Enviar dados para o controller
            fetch('/client', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(newClient)
            })
            .then(response => response.json())
            .then(data => {
                console.log('Success:', data);
                // Exibir mensagem de sucesso ou redirecionar
            })
            .catch((error) => {
                console.error('Error:', error);
                // Exibir mensagem de erro
            });
        }
    });
});
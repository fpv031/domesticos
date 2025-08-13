// cadastro.js

const btnPJ = document.getElementById('btnPJ');
const btnPF = document.getElementById('btnPF');
const cpfInput = document.getElementById('cpf');
const labelCpfCnpj = document.getElementById('labelCpfCnpj');

// Função para atualizar placeholder e label conforme tipo selecionado
function selecionarTipoPessoa(tipo) {
  if (tipo === 'PJ') {
    btnPJ.classList.add('active');
    btnPF.classList.remove('active');
    labelCpfCnpj.textContent = 'CNPJ *';
    cpfInput.placeholder = "00.000.000/0000-00";
    cpfInput.required = true;
  } else {
    btnPF.classList.add('active');
    btnPJ.classList.remove('active');
    labelCpfCnpj.textContent = 'CPF *';
    cpfInput.placeholder = "000.000.000-00";
    cpfInput.required = true;
  }
}

// Eventos de clique nos botões
btnPJ.addEventListener('click', () => selecionarTipoPessoa('PJ'));
btnPF.addEventListener('click', () => selecionarTipoPessoa('PF'));

// Inicializa com Pessoa Jurídica selecionada
selecionarTipoPessoa('PJ');

// Toggle de senha
const toggleSenha = document.getElementById('toggleSenha');
const senhaInput = document.getElementById('senha');

toggleSenha.addEventListener('click', () => {
  if (senhaInput.type === 'password') {
    senhaInput.type = 'text';
  } else {
    senhaInput.type = 'password';
  }
});
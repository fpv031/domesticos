// cadastro.js
const btnPJ = document.getElementById('btnPJ');
const btnPF = document.getElementById('btnPF');
const labelCpfCnpj = document.getElementById('labelCpfCnpj');
const cpfInput = document.getElementById('cpf');
const cadastroForm = document.querySelector('.cadastro-button').closest('form') || document.querySelector('body');

let pessoaJuridica = true;

btnPJ.addEventListener('click', () => {
  pessoaJuridica = true;
  btnPJ.classList.add('active');
  btnPF.classList.remove('active');
  labelCpfCnpj.textContent = 'CNPJ *';
  cpfInput.placeholder = '00.000.000/0000-00';
});

btnPF.addEventListener('click', () => {
  pessoaJuridica = false;
  btnPF.classList.add('active');
  btnPJ.classList.remove('active');
  labelCpfCnpj.textContent = 'CPF *';
  cpfInput.placeholder = '000.000.000-00';
});

document.querySelector('.cadastro-button').addEventListener('click', (e) => {
  e.preventDefault();
  
  const nome = document.getElementById('nome').value.trim();
  const sobrenome = document.getElementById('sobrenome').value.trim();
  const telefone = document.getElementById('telefone').value.trim();
  const cpfCnpj = cpfInput.value.trim();
  const email = document.getElementById('email').value.trim();
  const senha = document.getElementById('senha').value;
  const termos = document.getElementById('termos').checked;

  if (!nome || !sobrenome || !telefone || !cpfCnpj || !email || !senha || !termos) {
    alert('Preencha todos os campos e aceite os termos.');
    return;
  }

  const userData = {
    pessoaJuridica,
    nome,
    sobrenome,
    telefone,
    cpfCnpj,
    email,
    senha,
  };

  localStorage.setItem('domusproUser', JSON.stringify(userData));
  alert('Cadastro realizado com sucesso!');
  window.location.href = 'telalogin.html';  // Redireciona para login
});
document.addEventListener('DOMContentLoaded', () => {
  const loginForm = document.getElementById('loginForm');

  loginForm.addEventListener('submit', (e) => {
    e.preventDefault();

    const email = document.getElementById('email').value.trim();
    const senha = document.getElementById('senha').value;

    alert(`Tentando logar com:\nEmail: ${email}\nSenha: ${senha}`);
    // Aqui você pode fazer o fetch para seu back-end de login
  });
});

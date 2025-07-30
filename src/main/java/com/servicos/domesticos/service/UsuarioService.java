package com.servicos.domesticos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicos.domesticos.dto.UsuarioDTO;
import com.servicos.domesticos.model.Usuario;
import com.servicos.domesticos.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.nome);
        usuario.setEmail(dto.email);
        usuario.setSenha(dto.senha); // ideal: criptografar
        usuario.setTipo(dto.tipo);
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> listarPorTipo(String tipo) {
        return usuarioRepository.findByTipo(tipo);
    }
}
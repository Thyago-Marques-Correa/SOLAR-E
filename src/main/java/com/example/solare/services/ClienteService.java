package com.example.solare.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//import com.example.solare.models.Loja;
import com.example.solare.models.Cliente;
import com.example.solare.dto.UsuarioDTO;
import com.example.solare.repositories.ClienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    private void configurarUsuario(Cliente usuario, UsuarioDTO usuarioDTO) {
        usuario.setNome(usuarioDTO.getNome());
        usuario.setCpf(usuarioDTO.getCpf());
        usuario.setSenha(usuarioDTO.getSenha());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setLatitude(usuarioDTO.getLatitude());
        usuario.setLongitude(usuarioDTO.getLongitude());
    }

    public UsuarioDTO create(UsuarioDTO UsuarioDTO){
        Cliente usuario = new Cliente();
        configurarUsuario(usuario, UsuarioDTO);
        repository.save(usuario);
        UsuarioDTO.setId(usuario.getId());
        return UsuarioDTO;
    }

    public UsuarioDTO update(Long usuarioId, UsuarioDTO usuarioDTO) {
        Cliente usuario = repository.findById(usuarioId)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado com ID: " + usuarioId));

        configurarUsuario(usuario, usuarioDTO);
        repository.save(usuario);
        usuarioDTO.setId(usuario.getId());
        return usuarioDTO;
    }

    private UsuarioDTO mapearUsuario(Cliente usuario) {
        UsuarioDTO usuarioMap = new UsuarioDTO();
        usuarioMap.setId(usuario.getId());
        usuarioMap.setNome(usuario.getNome());
        usuarioMap.setCpf(usuario.getCpf());
        usuarioMap.setEmail(usuario.getEmail());
        usuarioMap.setSenha(usuario.getSenha());
        usuarioMap.setLatitude(usuario.getLatitude());
        usuarioMap.setLongitude(usuario.getLongitude());
        return usuarioMap;
    }

    public List<UsuarioDTO> getAll() {
        return repository.findAll().stream().map(this::mapearUsuario).collect(Collectors.toList());
    }

    public UsuarioDTO getById(Long usuarioId){
        Cliente usuarioRecuperado = repository.findById(usuarioId)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado com ID: " + usuarioId));

        return mapearUsuario(usuarioRecuperado);
    }

    public String delete(Long usuarioId){
        repository.deleteById(usuarioId);
        return "Usuário deletado com sucesso!";
    }

    public boolean authenticate(String email, String senha) {
        Optional<Cliente> usuarioOptional = Optional.ofNullable(repository.findByEmail(email));

        if (usuarioOptional.isPresent()) {
            Cliente usuario = usuarioOptional.get();
            return usuario.getSenha().equals(senha);
        }
        return false;
    }
}
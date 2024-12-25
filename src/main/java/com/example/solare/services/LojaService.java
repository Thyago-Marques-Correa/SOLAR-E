/* package com.example.solare.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.solare.dto.LojaDTO;
import com.example.solare.models.Loja;
import com.example.solare.repositories.LojaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LojaService {
    @Autowired
    private LojaRepository repository;

    private void configurarLoja(Loja loja, LojaDTO lojaDTO) {
        loja.setNome(lojaDTO.getNome());
        loja.setRazaoSocial(lojaDTO.getRazaoSocial());
        loja.setSenha(lojaDTO.getSenha());
        loja.setEmail(lojaDTO.getEmail());
        loja.setCnpj(lojaDTO.getCnpj());
        loja.setCidade(lojaDTO.getCidade());
        loja.setEstado(lojaDTO.getEstado());
    }

    public LojaDTO create(LojaDTO LojaDTO){
        Loja loja = new Loja();
        configurarLoja(loja, LojaDTO);
        repository.save(loja);
        LojaDTO.setId(loja.getId());
        return LojaDTO;
    }

    public LojaDTO update(Long lojaId, LojaDTO lojaDTO) {
        Loja loja = repository.findById(lojaId)
                .orElseThrow(() -> new EntityNotFoundException("Loja não encontrada com ID: " + lojaId));

        configurarLoja(loja, lojaDTO);
        repository.save(loja);
        lojaDTO.setId(loja.getId());
        return lojaDTO;
    }

    private LojaDTO mapearLoja(Loja loja) {
        LojaDTO lojaMap = new LojaDTO();
        lojaMap.setId(loja.getId());
        lojaMap.setNome(loja.getNome());
        lojaMap.setRazaoSocial((loja.getRazaoSocial()));
        lojaMap.setEmail(loja.getEmail());
        lojaMap.setSenha(loja.getSenha());
        lojaMap.setCnpj(loja.getCnpj());
        lojaMap.setCidade(loja.getCidade());
        lojaMap.setEstado(loja.getEstado());
        return lojaMap;
    }

    public List<LojaDTO> getAll() {
        return repository.findAll().stream().map(this::mapearLoja).collect(Collectors.toList());
    }

    public LojaDTO getById(Long lojaId){
        Loja lojaRecuperado = repository.findById(lojaId)
                .orElseThrow(() -> new EntityNotFoundException("Loja não encontrada com ID: " + lojaId));

        return mapearLoja(lojaRecuperado);
    }

    public String delete(Long lojaId){
        repository.deleteById(lojaId);
        return "Loja deletada com sucesso!";
    }


    public boolean authenticate(String email, String senha) {
        Optional<Loja> lojaOptional = repository.findByEmail(email);

        if (lojaOptional.isPresent()) {
            Loja loja = lojaOptional.get();
            return loja.getSenha().equals(senha);
        }
        return false;
    }
}
*/
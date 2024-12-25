package com.example.solare.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.solare.models.Tecnico;
import com.example.solare.dto.TecnicoDTO;
import com.example.solare.repositories.TecnicoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnicoService {
    @Autowired
    private TecnicoRepository repository;

    private void configurarTecnico(Tecnico tecnico, TecnicoDTO tecnicoDTO) {
        tecnico.setNome(tecnicoDTO.getNome());
        tecnico.setTelefone(tecnicoDTO.getTelefone());
        tecnico.setRazaoSocial(tecnicoDTO.getRazaoSocial());
        tecnico.setSenha(tecnicoDTO.getSenha());
        tecnico.setEmail(tecnicoDTO.getEmail());
        tecnico.setCnpj(tecnicoDTO.getCnpj());
        tecnico.setCidade(tecnicoDTO.getCidade());
        tecnico.setEstado(tecnicoDTO.getEstado());
        tecnico.setPreco(tecnicoDTO.getPreco());
    }

    public TecnicoDTO create(TecnicoDTO TecnicoDTO){
        Tecnico tecnico = new Tecnico();
        configurarTecnico(tecnico, TecnicoDTO);
        repository.save(tecnico);
        TecnicoDTO.setId(tecnico.getId());
        return TecnicoDTO;
    }

    public TecnicoDTO update(Long tecnicoId, TecnicoDTO tecnicoDTO) {
        Tecnico tecnico = repository.findById(tecnicoId)
                .orElseThrow(() -> new EntityNotFoundException("Tecnico não encontrada com ID: " + tecnicoId));

        configurarTecnico(tecnico, tecnicoDTO);
        repository.save(tecnico);
        tecnicoDTO.setId(tecnico.getId());
        return tecnicoDTO;
    }

    private TecnicoDTO mapearTecnico(Tecnico tecnico) {
        TecnicoDTO tecnicoMap = new TecnicoDTO();
        tecnicoMap.setId(tecnico.getId());
        tecnicoMap.setNome(tecnico.getNome());
        tecnicoMap.setRazaoSocial(tecnico.getRazaoSocial());
        tecnicoMap.setEmail(tecnico.getEmail());
        tecnicoMap.setTelefone(tecnico.getTelefone());
        tecnicoMap.setSenha(tecnico.getSenha());
        tecnicoMap.setCnpj(tecnico.getCnpj());
        tecnicoMap.setCidade(tecnico.getCidade());
        tecnicoMap.setEstado(tecnico.getEstado());
        tecnicoMap.setPreco(tecnico.getPreco());
        return tecnicoMap;
    }

    public List<TecnicoDTO> getAll() {
        return repository.findAll().stream().map(this::mapearTecnico).collect(Collectors.toList());
    }

    public TecnicoDTO getById(Long tecnicoId){
        Tecnico tecnicoRecuperado = repository.findById(tecnicoId)
                .orElseThrow(() -> new EntityNotFoundException("Tecnico não encontrada com ID: " + tecnicoId));

        return mapearTecnico(tecnicoRecuperado);
    }

    public String delete(Long tecnicoId){
        repository.deleteById(tecnicoId);
        return "Tecnico deletada com sucesso!";
    }
}
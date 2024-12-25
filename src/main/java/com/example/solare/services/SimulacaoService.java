package com.example.solare.services;

import com.example.solare.dto.SimulacaoDTO;
import com.example.solare.models.Simulacao;
import com.example.solare.repositories.SimulacaoRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SimulacaoService {
    @Autowired
    private SimulacaoRepository simulacaoRepository;

    public Simulacao salvarSimulacao(SimulacaoDTO simulacaoDTO) {
        Simulacao simulacao = new Simulacao();
        simulacao.setClienteId(simulacaoDTO.getClienteId());
        simulacao.setNome(simulacaoDTO.getNome());
        simulacao.setTipoProduto(simulacaoDTO.getTipoProduto());
        simulacao.setOrcamentoMaximo(simulacaoDTO.getOrcamentoMaximo());
        simulacao.setConsumoMedioMensal(simulacaoDTO.getConsumoMedioMensal());
        simulacao.setValorMedioContaEnergia(simulacaoDTO.getValorMedioContaEnergia());
        simulacao.setAnosPermanencia(simulacaoDTO.getAnosPermanencia());
        simulacao.setEspacoTotalInstalacao(simulacaoDTO.getEspacoTotalInstalacao());
        return simulacaoRepository.save(simulacao);
    }

    public List<SimulacaoDTO> listarSimulacoes() {
        List<Simulacao> simulacoes = simulacaoRepository.findAll();
        return simulacoes.stream()
                         .map(simulacao -> {
                             SimulacaoDTO dto = new SimulacaoDTO();
                             dto.setNome(simulacao.getNome());
                             dto.setClienteId(simulacao.getClienteId());
                             dto.setId(simulacao.getId());
                             return dto;
                         })
                         .collect(Collectors.toList());
    }
    
    public void deletarSimulacao(Long id) {
        simulacaoRepository.deleteById(id);
    }

    public SimulacaoDTO gerarRelatorio(Long id) {
        Simulacao simulacao = simulacaoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Simulação não encontrada"));
    
        SimulacaoDTO simulacaoDTO = new SimulacaoDTO();
        simulacaoDTO.setNome(simulacao.getNome());
        simulacaoDTO.setTipoImovel(simulacao.getTipoProduto());
        simulacaoDTO.setOrcamentoMaximo(simulacao.getOrcamentoMaximo());
        simulacaoDTO.setConsumoMedioMensal(simulacao.getConsumoMedioMensal());
        simulacaoDTO.setValorMedioContaEnergia(simulacao.getValorMedioContaEnergia());
        simulacaoDTO.setAnosPermanencia(simulacao.getAnosPermanencia());
        simulacaoDTO.setEspacoTotalInstalacao(simulacao.getEspacoTotalInstalacao());
        return simulacaoDTO;
    }
    
    public void atualizarSimulacao(Long id, SimulacaoDTO simulacaoDTO) {
        Simulacao simulacao = simulacaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Simulação não encontrada"));
    
        simulacao.setNome(simulacaoDTO.getNome());
        simulacao.setTipoProduto(simulacaoDTO.getTipoProduto());
        simulacao.setOrcamentoMaximo(simulacaoDTO.getOrcamentoMaximo());
        simulacao.setConsumoMedioMensal(simulacaoDTO.getConsumoMedioMensal());
        simulacao.setValorMedioContaEnergia(simulacaoDTO.getValorMedioContaEnergia());
        simulacao.setAnosPermanencia(simulacaoDTO.getAnosPermanencia());
        simulacao.setEspacoTotalInstalacao(simulacaoDTO.getEspacoTotalInstalacao());
    
        simulacaoRepository.save(simulacao);
    }
    
}
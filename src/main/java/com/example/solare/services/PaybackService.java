package com.example.solare.services;

import com.example.solare.models.Payback;
import com.example.solare.repositories.PaybackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaybackService {

    @Autowired
    private PaybackRepository paybackRepository;

    public List<Payback> findAll() {
        return paybackRepository.findAll();
    }

    public Optional<Payback> findById(Integer id) {
        return paybackRepository.findById(id);
    }

    public Payback save(Payback payback) {
        return paybackRepository.save(payback);
    }

    public void deleteById(Integer id) {
        paybackRepository.deleteById(id);
    }
}

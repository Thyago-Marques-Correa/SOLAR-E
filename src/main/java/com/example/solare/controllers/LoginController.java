package com.example.solare.controllers;

import com.example.solare.dto.LoginDTO;
//import com.example.solare.services.LojaService;
import com.example.solare.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)

public class LoginController {
    @Autowired
    private ClienteService usuarioService;

    @Autowired
    //private LojaService lojaService;

  /*  @PostMapping
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginDTO loginDTO) {
        Map<String, String> response = new HashMap<>();

        if (loginDTO.getUserType().equalsIgnoreCase("Cliente")) {
            boolean authenticated = usuarioService.authenticate(loginDTO.getEmail(), loginDTO.getSenha());
            if (authenticated) {
                response.put("message", "Cliente autenticado com sucesso");
                response.put("redirectUrl", "/cliente/dashboard");
                return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(response);
            }
        } else if (loginDTO.getUserType().equalsIgnoreCase("Loja")) {
            //boolean authenticated = lojaService.authenticate(loginDTO.getEmail(), loginDTO.getSenha());
           // if (authenticated) {
           //     response.put("message", "Loja autenticada com sucesso");
           //     response.put("redirectUrl", "/dashBoardLoja");
            //    return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(response);
           // }
        }

        response.put("message", "Credenciais inválidas");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
    } */

    @GetMapping("/dashBoardLoja")
    public String dashBoardLoja() {
        return "dashBoardLoja";
    }
}

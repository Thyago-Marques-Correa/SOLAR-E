package com.example.solare.controllers;


//import com.example.solare.services.LojaService;
import com.example.solare.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/cadastroLoja")
    public String cadastroLoja() {
        return "cadastroLoja";
    }

    @GetMapping("/cadastroUsuario")
    public String cadastroUsuario() {
        return "cadastroUsuario";
    }

    @GetMapping("/cadastroTecnico")
    public String cadastroTecnico() {
        return "cadastroTecnico";
    }

    @GetMapping("/obrigado")
    public String obrigado() {
        return "obrigado";
    }

    @GetMapping("/dashBoardLoja")
    public String dashBoardLoja() {
        return "dashBoardLoja";
    }

    @GetMapping("/cadastroProdutos")
    public String cadastroProdutos() {
        return "cadastroProdutos";
    }
}
package com.example.solare.dto;

public class LoginDTO {

    private String email;
    private String senha;
    private String userType;


    public LoginDTO(String email, String senha, String userType) {
        this.email = email;
        this.senha = senha;
        this.userType = userType;
    }

    // Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}


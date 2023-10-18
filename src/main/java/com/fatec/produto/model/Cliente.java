package com.fatec.produto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String celular;
    private String email;
    private String senha;

    private String confSenha;
    
    public Cliente() {
    }

    public Cliente(String nome, String celular, String email, String senha, String confSenha) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.senha = senha;
        this.confSenha = confSenha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome de usuário não pode estar nulo.");
        } else {
            this.nome = nome;
        }
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O email do usuário não pode estar nulo.");
        } else {
            this.email = email;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isBlank()) {
            throw new IllegalArgumentException("A senha do usuário não pode estar nulo.");
        } else {
            this.senha = senha;
        }
    }

    public String getConfSenha() {
        return confSenha;
    }

    public void setConfSenha(String confSenha) {
        if (confSenha == null || confSenha.isBlank()) {
            throw new IllegalArgumentException("A senha do usuário não pode estar nulo.");
        } else {
            this.confSenha = confSenha;
        }
    }
}

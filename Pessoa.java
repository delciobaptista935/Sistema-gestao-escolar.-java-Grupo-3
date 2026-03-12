package com.gestao.escolar.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Classe abstrata que representa uma Pessoa no sistema escolar
 * Implementa o pilar de ABSTRAÇÃO
 */
public abstract class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected String nome;
    protected String cpf;
    protected LocalDate dataNascimento;
    protected String email;
    protected String telefone;
    
    /**
     * Construtor da classe Pessoa
     */
    public Pessoa(String nome, String cpf, LocalDate dataNascimento, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }
    
    /**
     * Método abstrato - obriga as subclasses a implementarem
     */
    public abstract String obterDescricao();
    
    // ENCAPSULAMENTO - Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Pessoa{"
                + "nome='" + nome + '\''
                + ", cpf='" + cpf + '\''
                + ", dataNascimento=" + dataNascimento
                + ", email='" + email + '\''
                + ", telefone='" + telefone + '\''
                + '}';
    }
}
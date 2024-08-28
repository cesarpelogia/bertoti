package com.wonka.chocolate.domain;


public class ChocolateDTO {
    
    private static long nextId = 1;

    private Long id;
    private String nome;
    private String marca;
    private double preco;
    private double peso;

    public ChocolateDTO(String nome, String marca, double preco, double peso) {
        this.id = nextId++;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.peso = peso;
    }

    // Getters e Setters
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
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
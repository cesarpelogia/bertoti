package com.wonka.chocolate.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

// @Entity
// @Table(name = "chocolates")
public class ChocolateDTO {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private static long idCounter = 0;
    
    private long id;
    
    @JsonProperty("nome")
    private String nome;

    @JsonProperty("marca")
    private String marca;

    @JsonProperty("peso")
    private double peso;

    @JsonProperty("preco")
    private double preco;


    public ChocolateDTO(String nome, String marca, double peso, double preco){

        this.id = ++idCounter;
        this.nome = nome;
        this.marca = marca;
        this.peso = peso;
        this.preco = preco;

    }

    public List<ChocolateDTO> chocolates = new ArrayList<>();

    public long getId() {
        return id;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
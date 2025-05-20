/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upf.floriculturajardim.entity;

import jakarta.persistence.Entity;
import java.io.Serializable;

/**
 *
 * @author 198848
 */
@Entity
public class PlantasEntity implements Serializable {
    
    private int id;
    private String nome;
    private String especie;
    private String cor;
    private boolean folhagem;
    private boolean flor;
    private String preco_unitario;
    private int qtd_estoque;
    private int tamanho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isFolhagem() {
        return folhagem;
    }

    public void setFolhagem(boolean folhagem) {
        this.folhagem = folhagem;
    }

    public boolean isFlor() {
        return flor;
    }

    public void setFlor(boolean flor) {
        this.flor = flor;
    }

    public String getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(String preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}

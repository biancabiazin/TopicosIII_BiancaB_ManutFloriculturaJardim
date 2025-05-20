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
public class ItemPedidoEntity implements Serializable {
    
    private int id;
    private int planta;
    private int qtd;
    private int valor_unitario;
    private int valor_total;
    private boolean embalagem_presente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(int valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    public boolean isEmbalagem_presente() {
        return embalagem_presente;
    }

    public void setEmbalagem_presente(boolean embalagem_presente) {
        this.embalagem_presente = embalagem_presente;
    }
    
}

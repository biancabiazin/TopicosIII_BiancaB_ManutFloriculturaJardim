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
public class EntregasEntity implements Serializable {
    
    private int seq;
    private String endereco;
    private int cliente;
    private int pedido;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }
    
}

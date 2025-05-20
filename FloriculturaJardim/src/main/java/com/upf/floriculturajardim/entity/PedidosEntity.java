/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upf.floriculturajardim.entity;

import jakarta.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 198848
 */
@Entity
public class PedidosEntity implements Serializable {
    
    private int id;
    private Date data_pedido;
    private String status;
    private int cliente;
    private int item;
    private int valor_total;
    private String endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}

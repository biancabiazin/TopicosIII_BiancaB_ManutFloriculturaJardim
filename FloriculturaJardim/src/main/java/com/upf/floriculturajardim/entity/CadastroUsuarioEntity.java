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
public class CadastroUsuarioEntity implements Serializable {
    
    private int seq;
    private String nome;
    private String email;
    private boolean adm;
    private boolean entregador;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public boolean isEntregador() {
        return entregador;
    }

    public void setEntregador(boolean entregador) {
        this.entregador = entregador;
    }
    
}

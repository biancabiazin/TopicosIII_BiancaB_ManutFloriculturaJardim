/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.upf.floriculturajardim.controller;

import com.upf.floriculturajardim.entity.ClienteEntity;
import jakarta.ejb.EJB;
import jakarta.ejb.EJBException;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 198848
 */
@Named(value = "clienteController")
@SessionScoped
public class ClienteController implements Serializable {

    @EJB
    private com.upf.floriculturajardim.facade.ClienteFacade ejbFacade;

    public ClienteController() {
    }

    private PessoaEntity selected;

    private ClienteEntity cliente = new ClienteEntity();

    private List<ClienteEntity> clienteList = new ArrayList<>();

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public List<ClienteEntity> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<ClienteEntity> clienteList) {
        this.clienteList = clienteList;
    }

    public ClienteEntity prepareAdicionar() {
        cliente = new ClienteEntity();
        return cliente;
    }

    public void adicionarCliente() {
        Date datahoraAtual = new Timestamp(System.currentTimeMillis());
        cliente.setDatahorareg(datahoraAtual);
        persist(ClienteController.PersistAction.CREATE,
                "Registro incluído com sucesso!");
    }

    public void editarPessoa() {
        persist(ClienteController.PersistAction.UPDATE,
                "Registro alterado com sucesso!");
    }

    public void deletarPessoa() {
        persist(ClienteController.PersistAction.DELETE,
                "Registro excluído com sucesso!");
    }

    public static void addErrorMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public static void addSuccessMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
        FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
    }

    public static enum PersistAction {
        CREATE,
        DELETE,
        UPDATE
    }

    private void persist(PersistAction persistAction, String successMessage) {
        try {
            if (null != persistAction) {
                switch (persistAction) {
                    case CREATE:
                        ejbFacade.createReturn(cliente);
                        break;
                    case UPDATE:
                        ejbFacade.edit(selected);
                        selected = null;
                        break;
                    case DELETE:
                        ejbFacade.remove(selected);
                        selected = null;
                        break;
                    default:
                        break;
                }
            }
            addSuccessMessage(successMessage);
        } catch (EJBException ex) {
            String msg = "";
            Throwable cause = ex.getCause();
            if (cause != null) {
                msg = cause.getLocalizedMessage();
            }
            if (msg.length() > 0) {
                addErrorMessage(msg);
            } else {
                addErrorMessage(ex.getLocalizedMessage());
            }
        } catch (Exception ex) {
            addErrorMessage(ex.getLocalizedMessage());
        }
    }

}

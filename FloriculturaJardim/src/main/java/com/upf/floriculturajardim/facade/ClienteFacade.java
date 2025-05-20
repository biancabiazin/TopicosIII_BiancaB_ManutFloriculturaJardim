package com.upf.floriculturajardim.facade;

import com.upf.FloriculturaJardim.facade.AbstractFacade;
import com.upf.floriculturajardim.entity.ClienteEntity;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;


@Stateless       
public class ClienteFacade extends AbstractFacade<ClienteEntity> {

    @PersistenceContext(unitName = "ProjetojfprimefacesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(ClienteEntity.class);
    }

    private List<ClienteEntity> entityList;

    public List<ClienteEntity> buscarTodos() {
        entityList = new ArrayList<>();
        try {
            Query query = getEntityManager().createQuery("SELECT c FROM ClienteEntity c order by c.nome");
            if (!query.getResultList().isEmpty()) {
                entityList = (List<ClienteEntity>) query.getResultList();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        return entityList;
    }
}

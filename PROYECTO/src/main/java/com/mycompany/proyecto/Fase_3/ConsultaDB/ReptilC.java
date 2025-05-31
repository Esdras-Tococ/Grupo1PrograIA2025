/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.Fase_3.ConsultaDB;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ReptilC  implements Serializable {

    private EntityManagerFactory emf ;
    
    public ReptilC(EntityManagerFactory emf){
    
    this.emf = emf;
    
    
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Reptil reptil) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(reptil);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Reptil reptil) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(reptil);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(Integer id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Reptil reptil = em.find(Reptil.class, id);
            if (reptil != null) {
                em.remove(reptil);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Reptil findReptil(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reptil.class, id);
        } finally {
            em.close();
        }
    }

    public List<Reptil> findReptilEntities() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT r FROM Reptil r");
            return q.getResultList();
        } finally {
            em.close();
        }
    }
}

    


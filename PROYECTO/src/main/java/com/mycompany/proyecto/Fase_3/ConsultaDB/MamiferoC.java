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

public class MamiferoC implements Serializable {

    private EntityManagerFactory emf;
    
    public MamiferoC(EntityManagerFactory emf){
    
    
    this.emf = emf;
    
    
    
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Mamifero mamifero) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(mamifero);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Mamifero mamifero) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(mamifero);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(Integer id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Mamifero mamifero = em.find(Mamifero.class, id);
            if (mamifero != null) {
                em.remove(mamifero);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Mamifero findMamifero(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mamifero.class, id);
        } finally {
            em.close();
        }
    }

    public List<Mamifero> findMamiferoEntities() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT m FROM Mamifero m");
            return q.getResultList();
        } finally {
            em.close();
        }
    }
}

    
    
    
    

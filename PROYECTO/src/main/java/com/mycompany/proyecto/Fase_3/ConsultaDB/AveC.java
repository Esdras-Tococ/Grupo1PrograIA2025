
package com.mycompany.proyecto.Fase_3.ConsultaDB;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class AveC implements Serializable {
 private EntityManagerFactory emf ;
    public AveC(EntityManagerFactory emf){
        this.emf = emf;
    }
            
  
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ave ave) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(ave);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Ave ave) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(ave);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(Integer idAnimal) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Ave ave = em.find(Ave.class, idAnimal);
            if (ave != null) {
                em.remove(ave);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Ave findAve(Integer idAnimal) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ave.class, idAnimal);
        } finally {
            em.close();
        }
    }

    public List<Ave> findAveEntities() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT a FROM Ave a");
            return q.getResultList();
        } finally {
            em.close();
        }
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


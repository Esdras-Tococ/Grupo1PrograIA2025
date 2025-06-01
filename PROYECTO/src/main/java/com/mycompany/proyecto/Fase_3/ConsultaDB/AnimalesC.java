
package com.mycompany.proyecto.Fase_3.ConsultaDB;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class AnimalesC implements Serializable {

    private EntityManagerFactory emf ;
    public AnimalesC(EntityManagerFactory emf){
        this.emf = emf;
    }
            

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Animales animales) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(animales);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Animales animales) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(animales);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(Integer id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Animales animales = em.find(Animales.class, id);
            if (animales != null) {
                em.remove(animales);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public  Animales findAnimales(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Animales.class, id);
        } finally {
            em.close();
        }
    }

   public ArrayList<Animales> findAnimalesEntities() {
    EntityManager em = getEntityManager();
    try {
        return new ArrayList<Animales> (em.createNamedQuery("Animales.findAll", Animales.class).getResultList());
    } finally {
        em.close();
    }
}

}
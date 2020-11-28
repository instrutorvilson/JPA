/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Carro;
import entidades.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public class Dao {
    
    public static Carro consultaByPlaca(String pPlaca){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-BD-APPPU");
        EntityManager em = emf.createEntityManager();
       /* return em.createNamedQuery("Carro.findByPlaca", Carro.class)
               .setParameter("placa", pPlaca)
               .getSingleResult(); */
        String jpql = "SELECT c FROM Carro c WHERE c.placa = :placa";
        return em.createQuery(jpql, Carro.class)
          .setParameter("placa", pPlaca)
          .getSingleResult();
    }
    
    public static List<Carro> consultaCarros(){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-BD-APPPU");
       EntityManager em = emf.createEntityManager();
       return em.createNamedQuery("Carro.findAll", Carro.class)
                .getResultList();
    }
           

    public static boolean persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-BD-APPPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
        return true;
    }
    
    public static Cliente selecionarByCPF(String cpf){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-BD-APPPU");
      EntityManager em = emf.createEntityManager(); 
     /* TypedQuery<Cliente> tq = em.createNamedQuery("Cliente.findByCpf", Cliente.class);
      tq.setParameter("cpf", cpf);
      return tq.getSingleResult();*/
     return em.createNamedQuery("Cliente.findByCpf", Cliente.class)
              .setParameter("cpf", cpf)
              .getSingleResult();
    }

    public static List<Cliente> selecionarTodos(){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-BD-APPPU");
       EntityManager em = emf.createEntityManager(); 
       return em.createNamedQuery("Cliente.findAll", Cliente.class)
                .getResultList();
    }

}    


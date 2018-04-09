package facades;

import entities.Salesman;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.soap.SAAJResult;
import java.util.LinkedList;
import java.util.List;

@Stateless
public class SalesmanFacade {

    @PersistenceContext
    private EntityManager em;


    public void save(Salesman salesman)
    {
        em.persist(salesman);
    }

    public void merge(Salesman salesman){
        merge(salesman);
    }

    public void delete(long id){
        em.remove(em.find(Salesman.class,id));
    }

    public List<Salesman> findAll(){
        return em.createQuery("select b from Salesman b").getResultList();
    }


}

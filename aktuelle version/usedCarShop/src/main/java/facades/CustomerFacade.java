package facades;

import entities.Customer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Stateless
public class CustomerFacade {

    @PersistenceContext
    private EntityManager em;


    public void save(Customer customer)
    {
        em.persist(customer);
    }

    public void merge(Customer customer){
        merge(customer);
    }

    public void delete(long id){
        em.remove(em.find(Customer.class,id));
    }

    public List<Customer> findAll(){
        return em.createQuery("select b from Customer b").getResultList();
    }
}

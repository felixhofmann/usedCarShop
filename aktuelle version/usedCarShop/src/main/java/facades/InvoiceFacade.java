package facades;

import entities.Invoice;
import org.eclipse.persistence.internal.jpa.config.copypolicy.InstantiationCopyPolicyImpl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Stateless
public class InvoiceFacade {

    @PersistenceContext
    private EntityManager em;


    public void save(Invoice invoice)
    {
        em.persist(invoice);
    }

    public void merge(Invoice invoice){
        merge(invoice);
    }

    public void delete(long id){
        em.remove(em.find(Invoice.class,id));
    }

    public List<Invoice> findAll(){
        return em.createQuery("select b from Invoice b").getResultList();
    }
}

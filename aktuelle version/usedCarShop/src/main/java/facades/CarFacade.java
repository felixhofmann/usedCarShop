package facades;

import entities.Car;
import entities.Salesman;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Stateless
public class CarFacade {

    @PersistenceContext
    private EntityManager em;


    public void save(Car car)
    {
        em.persist(car);
    }

    public void merge(Car car){
        merge(car);
    }

    public void delete(long id){
        em.remove(em.find(Salesman.class,id));
    }

    public List<Car> findAll(){
        return em.createQuery("select b from Car b").getResultList();
    }
}

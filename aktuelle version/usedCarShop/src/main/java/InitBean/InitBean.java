package InitBean;

import entities.Car;
import entities.Customer;
import entities.Invoice;
import entities.Salesman;
import facades.CarFacade;
import facades.CustomerFacade;
import facades.InvoiceFacade;
import facades.SalesmanFacade;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.time.LocalDate;

@Startup
@Singleton
public class InitBean {

    @Inject
    SalesmanFacade salesmanFacade;

    @Inject
    InvoiceFacade invoiceFacade;

    @Inject
    CustomerFacade customerFacade;

    @Inject
    CarFacade carFacade;



    @PostConstruct
    public void init(){
        Car car = new Car("BMW","M3",1500,20000,12000,1993,false);
        carFacade.save(car);

        Customer customer = new Customer("hans","peter","hapeweg 33");
        customerFacade.save(customer);

        Salesman salesman = new Salesman("fred","heuerlich","A554");
        salesmanFacade.save(salesman);

        Invoice invoice = new Invoice(customer,salesman, LocalDate.of(2013,6,22),car,car.getSalePrice());
        invoiceFacade.save(invoice);

    }
}

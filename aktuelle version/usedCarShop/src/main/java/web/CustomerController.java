package web;

import entities.Customer;
import facades.CustomerFacade;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

@Model
@Named
public class CustomerController {

    @Inject
    CustomerFacade customerFacade;

    public CustomerController() {
        this.customer = new Customer();
    }

    Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    public void saveCustomer(){
        customerFacade.save(customer);
        customer = new Customer();
    }


}

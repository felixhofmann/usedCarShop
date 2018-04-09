package web;

import entities.Car;
import entities.Customer;
import entities.Invoice;
import entities.Salesman;
import facades.CarFacade;
import facades.CustomerFacade;
import facades.InvoiceFacade;
import facades.SalesmanFacade;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;
import java.time.LocalDate;
import java.util.List;

@Model
@Named
public class IndexController {

    @Inject
    SalesmanFacade salesmanFacade;

    @Inject
    InvoiceFacade invoiceFacade;

    @Inject
    CustomerFacade customerFacade;

    @Inject
    CarFacade carFacade;

    private List<Salesman> salesmanList;

    private List<Customer> customerList;

    private List<Invoice> invoiceList;

    private List<Car> carList;

    private Car selectedCar;
    private Customer selectedCusmtomer;
    private Salesman selectedSalesman;

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public Customer getSelectedCusmtomer() {
        return selectedCusmtomer;
    }

    public void setSelectedCusmtomer(Customer selectedCusmtomer) {
        this.selectedCusmtomer = selectedCusmtomer;
    }

    public Salesman getSelectedSalesman() {
        return selectedSalesman;
    }

    public void setSelectedSalesman(Salesman selectedSalesman) {
        this.selectedSalesman = selectedSalesman;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<Salesman> getSalesmanList() {
        return salesmanList;
    }

    public void setSalesmanList(List<Salesman> salesmanList) {
        this.salesmanList = salesmanList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

    @PostConstruct
    public void init(){
        Car car = new Car("test","test",1500,20000,12000,1993,false);
        carFacade.save(car);

        Customer customer = new Customer("hans","peter","hapeweg33");
        customerFacade.save(customer);

        Salesman salesman = new Salesman("fred","heuerlich","A554");
        salesmanFacade.save(salesman);

        Invoice invoice = new Invoice(customer,salesman,LocalDate.of(2013,6,22),car,car.getSalePrice());
        invoiceFacade.save(invoice);

        salesmanList = salesmanFacade.findAll();
        invoiceList = invoiceFacade.findAll();
        customerList = customerFacade.findAll();
        carList = carFacade.findAll();
    }


    public void generateInvoice(){
        if (selectedCar != null && selectedCusmtomer != null && selectedSalesman != null){
            Invoice invoice = new Invoice(selectedCusmtomer,selectedSalesman,LocalDate.now(),selectedCar,selectedCar.getSalePrice());
        }
    }
}


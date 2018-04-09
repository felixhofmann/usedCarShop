package entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Customer customer;
    @OneToOne
    private Salesman salesman;
    private LocalDate dateOfSale;
    @OneToOne
    private Car soldCars;
    private int price;

    public Invoice() {
    }

    public Invoice(Customer customer, entities.Salesman salesman, LocalDate dateOfSale,Car soldCars, int price) {
        this.customer = customer;
        this.salesman = salesman;
        this.dateOfSale = dateOfSale;
        this.soldCars = soldCars;
        this.price = price;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public entities.Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(entities.Salesman salesman) {
        this.salesman = salesman;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(LocalDate dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Car getSoldCars() {
        return soldCars;
    }

    public void setSoldCars(Car soldCars) {
        this.soldCars = soldCars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

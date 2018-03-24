package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.LinkedList;

public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Customer customer;
    private Salesman Salesman;
    private LocalDate dateOfSale;
    private LinkedList<Car> soldCars;
    private int price;
    private Location sellLocation;

    public Invoice() {
    }

    public Invoice(Customer customer, entities.Salesman salesman, LocalDate dateOfSale, LinkedList<Car> soldCars, int price, Location sellLocation) {
        this.customer = customer;
        Salesman = salesman;
        this.dateOfSale = dateOfSale;
        this.soldCars = soldCars;
        this.price = price;
        this.sellLocation = sellLocation;
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
        return Salesman;
    }

    public void setSalesman(entities.Salesman salesman) {
        Salesman = salesman;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(LocalDate dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public LinkedList<Car> getSoldCars() {
        return soldCars;
    }

    public void setSoldCars(LinkedList<Car> soldCars) {
        this.soldCars = soldCars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Location getSellLocation() {
        return sellLocation;
    }

    public void setSellLocation(Location sellLocation) {
        this.sellLocation = sellLocation;
    }
}

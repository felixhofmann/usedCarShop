package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String brand;
    private Double kilometer;
    private int manufactoringPrice;
    private int salePrice;
    private LocalDate manufactoringDate;
    private boolean isSold;

    public Car() {
    }

    public Car(String type, String brand, Double kilometer, int manufactoringPrice, int salePrice, LocalDate manufactoringDate, boolean isSold) {
        this.type = type;
        this.brand = brand;
        this.kilometer = kilometer;
        this.manufactoringPrice = manufactoringPrice;
        this.salePrice = salePrice;
        this.manufactoringDate = manufactoringDate;
        this.isSold = isSold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getKilometer() {
        return kilometer;
    }

    public void setKilometer(Double kilometer) {
        this.kilometer = kilometer;
    }

    public int getManufactoringPrice() {
        return manufactoringPrice;
    }

    public void setManufactoringPrice(int manufactoringPrice) {
        this.manufactoringPrice = manufactoringPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public LocalDate getManufactoringDate() {
        return manufactoringDate;
    }

    public void setManufactoringDate(LocalDate manufactoringDate) {
        this.manufactoringDate = manufactoringDate;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
}

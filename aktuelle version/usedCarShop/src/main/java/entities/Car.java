package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String brand;
    private int kilometer;
    private int manufactoringPrice;
    private int salePrice;
    private int manufactoringDate;
    private boolean isSold;

    public Car() {
    }

    public Car(String type, String brand, int kilometer, int manufactoringPrice, int salePrice, int manufactoringDate, boolean isSold) {
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

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
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

    public int getManufactoringDate() {
        return manufactoringDate;
    }

    public void setManufactoringDate(int manufactoringDate) {
        this.manufactoringDate = manufactoringDate;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
}

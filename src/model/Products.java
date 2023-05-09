package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Products {
    protected String productName;
    protected String productIdentifier;
    protected LocalDate expirationDate;
    protected int lotNumber;
    protected LocalDate packagingDate;
    protected int numberOfProducts;

    public Products(String productName, String productIdentifier, String expirationDate,
                    int lotNumber, String packagingDate, int numberOfProducts) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        this.productName= productName;
        this.productIdentifier = productIdentifier;
        this.expirationDate = LocalDate.parse(expirationDate,formatter);
        this.lotNumber = lotNumber;
        this.packagingDate = LocalDate.parse(packagingDate,formatter);
        this.numberOfProducts = numberOfProducts;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public LocalDate getPackagingDate() {
        return packagingDate;
    }

    public void setPackagingDate(LocalDate packagingDate) {
        this.packagingDate = packagingDate;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public abstract void printProducts();
//    public abstract void addProducts();
}

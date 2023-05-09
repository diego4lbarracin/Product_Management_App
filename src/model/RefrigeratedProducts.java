package model;

public class RefrigeratedProducts extends Products {
    private String superVisionCode;
    private double storageDesiredTemperature;

    public RefrigeratedProducts(String productName, String productIdentifier, String expirationDate, int lotNumber,
                                String packagingDate, int numberOfProducts, String superVisionCode, double storageDesiredTemperature) {
        super(productName, productIdentifier, expirationDate, lotNumber, packagingDate, numberOfProducts);
        this.superVisionCode = superVisionCode;
        this.storageDesiredTemperature = storageDesiredTemperature;
    }

    public String getSuperVisionCode() {
        return superVisionCode;
    }

    public void setSuperVisionCode(String superVisionCode) {
        this.superVisionCode = superVisionCode;
    }

    public double getStorageDesiredTemperature() {
        return storageDesiredTemperature;
    }

    public void setStorageDesiredTemperature(double storageDesiredTemperature) {
        this.storageDesiredTemperature = storageDesiredTemperature;
    }

    @Override
    public void printProducts() {
            System.out.println("----------------------------------------------");
            System.out.println("Product name: "+ getProductName());
            System.out.println("Product Identifier: "+ getProductIdentifier());
            System.out.println("Expiration Date: "+ getExpirationDate());
            System.out.println("Lot Number: "+ getLotNumber());
            System.out.println("Packaging Date: "+ getPackagingDate());
            System.out.println("Stock: "+ getNumberOfProducts());
            System.out.println("Storage Desired Temperature: "+ getStorageDesiredTemperature());
            System.out.println("Supervision Code: "+ getSuperVisionCode());
            System.out.println("----------------------------------------------");
    }
//
//    @Override
//    public void addProducts() {
//
//    }
}

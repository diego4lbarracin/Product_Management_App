package model;

public class FreshProducts extends Products {
    private String countryOfOrigin;

    public FreshProducts(String productName, String productIdentifier, String expirationDate, int lotNumber, String packagingDate, int numberOfProducts, String countryOfOrigin) {
        super(productName,productIdentifier, expirationDate, lotNumber, packagingDate, numberOfProducts);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    public void setCountryOfOrigin(String countryOfOrigin){
        this.countryOfOrigin = countryOfOrigin;
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
        System.out.println("Country of Origin: "+ getCountryOfOrigin());
        System.out.println("----------------------------------------------");
    }

//    @Override
//    public void addProducts() {
//        ArrayList<model.FreshProducts> freshProducts = new ArrayList<>();
//        freshProducts.add(this);
//    }
}

package ui;

import model.FreshProducts;
import model.FrozenProducts;
import model.RefrigeratedProducts;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    static Scanner sc= new Scanner(System.in);
    public static ArrayList<FreshProducts> freshProductsArrayList= new ArrayList<>();
    public static ArrayList<RefrigeratedProducts> refrigeratedProductsArrayList= new ArrayList<>();
    public static ArrayList<FrozenProducts> frozenProductsArrayList= new ArrayList<>();

    public static void uiMenu(){

        int option;
        do {
            System.out.println("PRODUCT MANAGEMENT APPLICATION");
            System.out.println("Select the desired option.");
            System.out.println("(1) Add a product to its list.");
            System.out.println("(2) Print the list of products.");
            System.out.println("(3) Exit.");
            option= sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    addProductByType();
                    break;
                case 2:
                    printProductByType();
                    break;
                case 3:
                    System.out.println("You've exited.");
                    break;
                default:
                    System.out.println("You've chosen a wrong option.");
                    System.out.println("Please, select a correct option.");
                    break;
            }
        }while (option!=3);
    }

    public static void addProductByType(){
        int option;

        String productName;
        String productIdentifier;
        String expirationDate;
        int lotNumber;
        String packagingDate;
        int numberOfProducts;
        String countryOfOrigin;
        String superVisionCode;
        double storageDesiredTemperature;

        do{
            System.out.println("(1) Add a Fresh Product.");
            System.out.println("(2) Add a Refrigerated Product.");
            System.out.println("(3) Add a Frozen Product.");
            System.out.println("(0) Return to the Main Menu.");
            System.out.println("Select the desired option.");
            option= sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 0:
                    System.out.println("Returning to the Main Menu ...");
                    break;
                case 1:
                    try {
                        System.out.println("FRESH PRODUCT");
                        System.out.println("Enter the product name: ");
                        productName= sc.nextLine();
                        System.out.println("Enter the product identifier: ");
                        productIdentifier= sc.nextLine();
                        System.out.println("Enter the expiration date (MM/dd/yyyy): ");
                        expirationDate= sc.nextLine();
                        System.out.println("Enter the lot number: ");
                        lotNumber= sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the packaging date (MM/dd/yyyy): ");
                        packagingDate= sc.nextLine();
                        System.out.println("Stock: ");
                        numberOfProducts= sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the country of origin: ");
                        countryOfOrigin= sc.nextLine();
                        if(productName==null || productIdentifier==null || expirationDate==null || lotNumber<0 || numberOfProducts<=0
                        || countryOfOrigin==null){
                            throw new Exception("The product couldn't be added to the list because one of the parameter was empty or null");
                        }
                        FreshProducts fP= new FreshProducts(productName, productIdentifier, expirationDate, lotNumber,
                                packagingDate, numberOfProducts, countryOfOrigin);

                        freshProductsArrayList.add(fP);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("REFRIGERATED PRODUCT");
                        System.out.println("Enter the product name: ");
                        productName= sc.nextLine();
                        System.out.println("Enter the product identifier: ");
                        productIdentifier= sc.nextLine();
                        System.out.println("Enter the expiration date (MM/dd/yyyy): ");
                        expirationDate= sc.nextLine();
                        System.out.println("Enter the lot number: ");
                        lotNumber= sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the packaging date (MM/dd/yyyy): ");
                        packagingDate= sc.nextLine();
                        System.out.println("Stock: ");
                        numberOfProducts= sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the supervision code: ");
                        superVisionCode= sc.nextLine();
                        System.out.println("Enter the storage desired temperature: ");
                        storageDesiredTemperature= sc.nextDouble();
                        if(productName==null || productIdentifier==null || expirationDate==null || lotNumber<0 || numberOfProducts<=0
                                || superVisionCode==null || Double.isNaN(storageDesiredTemperature)){
                            throw new Exception("The product couldn't be added to the list because one of the parameter was empty or null");
                        }
                        RefrigeratedProducts rP= new RefrigeratedProducts(productName,productIdentifier,expirationDate, lotNumber,packagingDate,
                                numberOfProducts,superVisionCode,storageDesiredTemperature);
                        refrigeratedProductsArrayList.add(rP);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        System.out.println("FROZEN PRODUCT");
                        System.out.println("Enter the product name: ");
                        productName= sc.nextLine();
                        System.out.println("Enter the product identifier: ");
                        productIdentifier= sc.nextLine();
                        System.out.println("Enter the expiration date (MM/dd/yyyy): ");
                        expirationDate= sc.nextLine();
                        System.out.println("Enter the lot number: ");
                        lotNumber= sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the packaging date (MM/dd/yyyy): ");
                        packagingDate= sc.nextLine();
                        System.out.println("Stock: ");
                        numberOfProducts= sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the storage desired temperature: ");
                        storageDesiredTemperature= sc.nextDouble();
                        if(productName==null || productIdentifier==null || expirationDate==null || lotNumber<0 || numberOfProducts<=0
                                || Double.isNaN(storageDesiredTemperature)){
                            throw new Exception("The product couldn't be added to the list because one of the parameter was empty or null");
                        }
                        FrozenProducts frozenP= new FrozenProducts(productName,productIdentifier,expirationDate, lotNumber,packagingDate,
                                numberOfProducts,storageDesiredTemperature);
                        frozenProductsArrayList.add(frozenP);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Select a correct option.");
                    break;
            }
        }while (option!=0);
    }

    public static void printProductByType(){
        int option;
        do {
            System.out.println("(1) Print the list of Fresh model.Products.");
            System.out.println("(2) Print the list of Refrigerated model.Products.");
            System.out.println("(3) Print the list of Frozen model.Products.");
            System.out.println("(0) Return to the Main Menu.");
            System.out.println("Select the desired option.");
            option= sc.nextInt();
            sc.nextLine();
            switch (option){
                case 0:
                    System.out.println("Returning to the Main Menu.");
                    break;
                case 1:
                    for (FreshProducts freshProducts : freshProductsArrayList) {
                        freshProducts.printProducts();
                    }
                    break;
                case 2:
                    for (RefrigeratedProducts refrigeratedProducts : refrigeratedProductsArrayList) {
                        refrigeratedProducts.printProducts();
                    }
                    break;
                case 3:
                    for (FrozenProducts frozenProducts : frozenProductsArrayList) {
                        frozenProducts.printProducts();
                    }
                    break;
                default:
                    System.out.println("You've chosen a wrong option.");
                    System.out.println("Please, select a correct option.");
                    break;
            }
        }while (option!=0);
    }
}

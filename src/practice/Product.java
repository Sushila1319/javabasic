package practice;

public class Product {

    String productName;
    int price;
    double discount;
    long productCode;
    char alpha;
    boolean isAvailable = true;

    public void allInfo() {

        System.out.println(" Name of the product: " + productName);
        System.out.println(" Price of the product: " + price);
        System.out.println(" Discount on product: " + discount);
        System.out.println(" Code of the product:" + productCode);
        System.out.println(" Alphabetically store aisle: " + alpha);
        System.out.println(" Available in store : " + isAvailable);
    }
}

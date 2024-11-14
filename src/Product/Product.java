package Product;

public class Product {
    //class variables
    String name;
    float price;
    char grade;
    Long serialNumber;
    Double discount;

    public String getName(){
        return name;
    }

    //method or function with arguments
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice(){
        return price;
    }

    public char getGrade(){
        return grade;
    }

    public Long getSerialNumber(){
        return serialNumber;
    }

    public Double getDiscount(){
    return discount;
    }
    public void setPrice(float price){
        this.price=price;
    }

}




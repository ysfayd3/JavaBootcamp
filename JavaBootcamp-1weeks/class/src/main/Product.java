package main;

public class Product {

    private String name;
    private  double price;
    private  String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //this =product
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        return ;


    }
}

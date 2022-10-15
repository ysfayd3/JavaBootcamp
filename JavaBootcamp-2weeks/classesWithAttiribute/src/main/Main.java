package main;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.set_name("Laptop");
        product.set_id(56);
        System.out.println(product.getKod());


        ProductManager productManager = new ProductManager();
        productManager.ekle(product);


    }
}

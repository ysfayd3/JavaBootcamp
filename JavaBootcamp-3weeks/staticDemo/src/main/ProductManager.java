package main;

public class ProductManager {
    public void add(Product product){

        //ProductValidator validator=new ProductValidator();
        //eger statıc yaparsak  newlememıze gerek kalmaz
        if(ProductValidator.isValid(product)){
            System.out.println("Kayıt eklendi");
        }
        else {
            System.out.println("ürün bılgılerı gecırsızdır");
        }

    }
}

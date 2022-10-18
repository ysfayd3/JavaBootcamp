package main;

public class ProductValidator {

    //ürünü güncellerken ve kaydederken kurallara uygun olup olmadıgını bulmak için

    public static boolean isValid(Product product){

        if(product.price>0 && !product.name.isEmpty())
        {
            return true;
        }
        else {
            return false;
        }

    }
}

package main;

public class Main {

    public static <urunler> void main(String[] args) {
	// write your code here

        Product product1=new Product();
        product1.setPrice(23);
        Product product2=new Product();
        product2.setDescription("alman beni");
        Product product3=new Product();
        product3.setName("alma benı almaaa fasdfs");


        Product[]  urunler=new Product[]{product1,product2,product3};

        System.out.println();

       for( int  i=0;i<urunler.length;i++){
           System.out.println(urunler[2].getName());
           System.out.println(urunler[0].getPrice());
           System.out.println(urunler[i].getDescription());
       }


    }
}

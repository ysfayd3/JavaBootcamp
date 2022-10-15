package main;

public class Main {

    public static void main(String[] args) {

        //6--> 1,2,3=6

        int number=5;
         int toplam=0;

        for(int i = 1; i < number; i++)
        {
            if(number % i == 0) {
                toplam += i;
            }
        }


        if(number==toplam)
        {
            System.out.println("Mukemmelr bır sayıdır");
        }
        else
        {
            System.out.println("Mukemmel bir sayı degıldır");
        }


    }
}

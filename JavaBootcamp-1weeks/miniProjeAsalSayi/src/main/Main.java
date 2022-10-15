package main;

public class Main {

    public static void main(String[] args) {

        int number=-2;
        int remender =number%2;//kalan
        //System.out.println(remender );

        if (number==1)
        {
            System.out.println("Asal sayı degıldır");
            return;//bunu yapmamızın amacı  burayı dırekt bıtırmek
        }
        if(number<2)
        {
            System.out.println("Gecersız sayıdır");
            return;
        }

        boolean isPrime=true;
        for (int i=2;i<number;i++)
        {
            if (number%i==0)
            {
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("SAyı asaldır");
        }
        else {
            System.out.println("sayı asal degıldır");
        }



    }
}

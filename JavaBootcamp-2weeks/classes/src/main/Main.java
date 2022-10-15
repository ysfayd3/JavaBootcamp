package main;

public class Main {

    public static void main(String[] args) {
        //referans type
        CustomerManager customerManager=new CustomerManager();//anlamsızlastı
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;

        customerManager.Add();
        customerManager.Update();
        customerManager.Delete();


        //value
        int sayi=10,sayi2=20;
        sayi2=sayi;
        sayi=30;
        System.out.println(sayi2);

        //burda yaptıgımız şey sayılar 2 nın gosterdıgı adresı degıstırmek yanı artık
        // 4 5 6 yı degıl sayılar bır gıbı 1 2 3 u gosterır. yanı bızım sayılar bırde yaptıgımız bır degıslık
        //sayılar 2 yı de etkıler .

        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

    }
}



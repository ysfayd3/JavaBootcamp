package main;

public class Main {

    public static void main(String[] args) {

        mesajVer();
        System.out.println(topla(10,25));
        System.out.println(yuzdeBul(106,9));


    }

    public  static void mesajVer(){

        System.out.println("Merhaba");
    }
    //Clean code yazmak amaç
    public  static int topla(int sayi1, int sayi2)
    {
        int  toplam=sayi1+sayi2;

        return toplam;
    }

    public static double yuzdeBul(int i, int i1){
        int  toplam=topla(i,i1);
        double sonuc=toplam*10/100;

        return sonuc;

    }
    public  static int krediHesapla(double krediMiktari){

        return 12300;


    }

}

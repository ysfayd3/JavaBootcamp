package main;

public class Main {

    public static void main(String[] args) {

        sayiBulmaca();

    }


    public static void sayiBulmaca(){

        int[] sayilar=new int[]{1,2,3,4,5,6,0};
        int aranacak=5;
        boolean varMı=false;

        for(int sayi:sayilar)
        {
            if (sayi==aranacak)
            {
                varMı=true;
                break;
            }
        }
        if (varMı){
            mesajVer("Sayı bulundu:"+aranacak);
        }
        else
            mesajVer("SAyı bulunamadı:"+aranacak);
    }

    public  static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }



}

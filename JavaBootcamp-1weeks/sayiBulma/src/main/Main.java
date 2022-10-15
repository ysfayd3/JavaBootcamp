package main;

public class Main {

    public static void main(String[] args) {

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
             System.out.println("Sayı bulundu");
         }
         else
             System.out.println("SAyı bulunamadı");


    }
}

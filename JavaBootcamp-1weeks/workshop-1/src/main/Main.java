package main;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] sayilar=new int[] {1,3,4,5,6,7,8,9,10};
        int aranacakSayi=17;

        boolean varMı=sayiBul(sayilar,aranacakSayi);
        mesajVer(varMı,aranacakSayi);



    }
    //fonksıyon yaz bool döndursun

    //iki  parametre alsın birinci parametre diziyi alsin - sayiBul
    //ikinci sayi alsin
    // 3. dızıde vardır
    public  static boolean sayiBul(int[] sayilar, int aranacaksayi){
        boolean varMi=false;

        for (int sayi: sayilar){
            if (sayi==aranacaksayi)
            {
                varMi=true;
                break;
            }
        }
        return  varMi;
    }
    public static void mesajVer(boolean varMi,int aranacaksayi){

        String metin="";
        if (varMi==true){
            metin="Syi mevcuttur"+aranacaksayi;
            System.out.println(metin);
        }
        else {
            System.out.println("sayi mevcut degıldır"+aranacaksayi);
        }

    }



}

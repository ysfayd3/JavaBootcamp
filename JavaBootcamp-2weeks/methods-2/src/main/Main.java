package main;

public class Main {

    public static void main(String[] args) {

        //25. video
        String mesaj = "Bugun hava cok guzel";

        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println(sayi);

        //26. video
        int toplam = topla2(23, 4, 5, 5, 6, 4);
        System.out.println(toplam);

    }


    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("Guncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
//... noktanın anlamı bırden fazla degısken verıcez demek

        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;

    }

    public static String sehirVer() {
        return "Ankara";
    }

}

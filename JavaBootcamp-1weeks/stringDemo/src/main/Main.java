package main;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
      String metin = "Bugun hava bozuk.";

        System.out.println(metin);
/*
        System.out.println("Eleman sayısı:" + metin.length());
        System.out.println("altıncı eleman " + metin.charAt(7));//o elemanı verır
        //bır sey yakalamak ıstıyorsak

        System.out.println(metin.concat("Yagmur yagabilir"));//birletiriyor metınlerı
        System.out.println(metin.startsWith("B"));// b ıle baslıyor mu kucuk buyuk harf duyarlıdır

        char[] karakterler = new char[6];
        metin.getChars(0, 6, karakterler, 0);//bırsey dndurmeyen
        System.out.println(karakterler);

        System.out.println(metin.indexOf('a'));//kacıncı eleman oldugunu verır. ilk buldugunu verır.
        System.out.println(metin.lastIndexOf('i'));*/


        System.out.println(metin.replace("Bugun","Bügün"));//yer degıstırmek ıcın
        System.out.println(metin.substring(3));//o ındexten yazmaya baslar
        System.out.println(metin.substring(5,13));

        for (String s:metin.split(" "))
        {
            System.out.println(s );

        }

        System.out.println(metin.toLowerCase());
        System.out.println(metin.toUpperCase());//bunları veritabanlarında arama ıslemınde
        System.out.println(metin.trim());//metının basında kı ve sonunda kı boslukları atar

    }

}

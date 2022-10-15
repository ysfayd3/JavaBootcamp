package main;

public class Main {

    public static void main(String[] args) {

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Yusuf";
        ogrenciler[1] = "ahmet";
        ogrenciler[2] = "burak";
        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------------------");

        for(String s:ogrenciler){
            System.out.println(s);
        }


    }
}

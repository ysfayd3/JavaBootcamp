package main;

public class BaseKrediManager {
    public  double krediHesapla(double tutar){
        //publicden sonra final kullanırsak ogrencı kredı de overriding yapamazdık yanı ezmezdık
        return tutar*1.18;



    }
}



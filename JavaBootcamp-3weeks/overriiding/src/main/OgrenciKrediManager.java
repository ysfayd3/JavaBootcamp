package main;

public class OgrenciKrediManager extends BaseKrediManager {
    public double krediHesapla(double tutar) {
        //aslında burda base hesaplasını burda ögrencı için ezdik yani guncelledık
        //overrinding yaptık yani


        return tutar * 1.10;


    }
}

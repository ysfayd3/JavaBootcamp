package main;

public class Main {

    public static void main(String[] args) {

     BaseKrediManager[] baseKrediManagers=new BaseKrediManager[]
             {new AskeriKrediManager(),new TarımKrediManager(),new OgrenciKrediManager()};
     //dizini icınde kredı manager var

        for (BaseKrediManager baseKrediManager:baseKrediManagers)
        {
            System.out.println(baseKrediManager.krediHesapla(1000));

        }


    }
}

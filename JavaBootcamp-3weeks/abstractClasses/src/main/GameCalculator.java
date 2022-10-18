package main;

public abstract class GameCalculator {
    //abstract sınıflar asla newlenemez


    public abstract void hesapla();//kım kalıtıyorsa kullanabılır ama override etmek zorunda kendısı yazmak zorunda

    //game calculatoru kım kullanıyorsa  game overı oldugu gıbı kullanmak zorunda
    public  void gameOver() {
        System.out.println("Oyun bitti");


    }
}


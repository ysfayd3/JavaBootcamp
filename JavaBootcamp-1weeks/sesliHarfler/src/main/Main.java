package main;

public class Main {

    public static void main(String[] args) {

        char metin = 'e';
        switch (metin) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın seslılerdır:" + metin);
                break;
            default:
                System.out.println("ince seslilerdır:" + metin);


        }


    }
}

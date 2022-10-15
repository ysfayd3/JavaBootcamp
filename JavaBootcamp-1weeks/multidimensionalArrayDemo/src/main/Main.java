package main;

public class Main {

    public static void main(String[] args) {


        String [][] sehirler=new String[3][3];

        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="New york";
        sehirler[1][0]="Berlin";
        sehirler[1][1]="Tokyo";
        sehirler[1][2]="İsparda";
        sehirler[2][0]="Ankara";
        sehirler[2][1]="Roma";
        sehirler[2][2]="Londra";

        for (int i=0;i<3;i++)
        {
            System.out.println("-------------");
            for (int j=0;j<3;j++){

                System.out.println(sehirler[i][j]);
            }
        }





    }
}

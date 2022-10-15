package intro;

public class Main {

    public static void main(String[] args){

        double dolarDun=18.20;
        double dolarBugun=18.20;


        Boolean dolarDustuMu=false;
        String okYonu="";

        if(dolarBugun<dolarDun){

            okYonu="down.svg";
            System.out.println(okYonu);

        }
        else if (dolarBugun == dolarDun){
            okYonu= "constant";
            System.out.println(okYonu);
        }
        else {

            okYonu="up.svg";
            System.out.println(okYonu);

        }





    }



}

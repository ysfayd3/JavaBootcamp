package main;

public class Main {

    public static void main(String[] args) {


        CustomerManager customerManager=new CustomerManager();
        customerManager.baseDataBaseManager=new MsSqlDataBaseManager();//Stratjımız belırlerdık burda
        //
        customerManager.getCustomers();




    }
}

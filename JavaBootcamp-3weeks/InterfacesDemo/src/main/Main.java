package main;

public class Main {

    public static void main(String[] args) {

        //ICustomerDal customerDal=new OracleCustomerDal();// interface onu implemente eden clasın refaransını tutabilir
        //aklında bulunsun


        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        //bu dıger yontemde yapıyoruz ama unutma ıhtımalımız oldugu ıcın ve  calısma sırasında verımlı olmayacagında  kullnamıyoruz
        // customerManager.customerDal=new OracleCustomerDal();
        customerManager.add();


    }
}

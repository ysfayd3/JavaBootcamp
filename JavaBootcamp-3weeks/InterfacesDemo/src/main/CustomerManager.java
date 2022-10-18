package main;

public class CustomerManager {
   private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {//buraya ne gonderırsen asagıda kı parametre de o olur
        this.customerDal = customerDal;
    }

    public  void add(){
        //burada iş kodları yazılır
        customerDal.Add();
    }

}

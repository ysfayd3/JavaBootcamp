package main;

public class Main {

    public static void main(String[] args) {
//        BaseLogger[] loggers=new BaseLogger[]{new FİleLogger(),new EmailLogger(),new DatabaseLogger()};
//        for (BaseLogger logger:loggers)
//        {
//            logger.log("Log mesajı");
//        }


        //new fıle kısmı degısebılır orası emaıl de olabılır amac refans tuttugu yerı getırtmek
        CustomerManager customerManager=new CustomerManager(new FİleLogger());//polymorphisim oldugu yer bburası

        customerManager.add();




    }
}

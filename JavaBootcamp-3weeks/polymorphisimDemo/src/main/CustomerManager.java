package main;


public class CustomerManager {
    private  BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {//burda aslında emaıl base yok sadece refans tutuyor
        this.baseLogger = baseLogger;
    }

    public void add(){
        System.out.println("müşteri eklendi");
        this.baseLogger.log("Log mesajı");//burda da o refansın tutugu yeri yazdırdık email baseın logu calısıyor
    }


}

package main;

public class MySqlCustomerDal implements ICustomerDal,IRepositoryDal{
    @Override
    public void Add() {
        System.out.println("My sql eklendi  ");
    }

    @Override
    public void Delete() {
        System.out.println("My sql silindi  ");
    }
}

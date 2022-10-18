package main;

public class OracleCustomerDal implements ICustomerDal,IRepositoryDal{
    @Override
    public void Add() {
        System.out.println("Oracle verileri çekildi");
    }

    @Override
    public void Delete() {
        System.out.println("Oracle verileri silindi");
    }
}

package main;

public class Product {

    public  Product(){
        System.out.println("Yapıcı oluşturuldu");
    }


    //bilgileri verdik
    //Attiribute veya field denıyor
    private int _id;
    private  String _name;
    private  String _description;
    private  Double _price;
    private  int _uintInStock;
    private String kod;

    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        _id = id;//this yazmasanda sıkıntı yok
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public Double get_price() {
        return _price;
    }

    public void set_price(Double price) {
        this._price = price;
    }

    public int get_uintInStock() {
        return _uintInStock;
    }

    public void set_uintInStock(int uintInStock) {
        this._uintInStock = uintInStock;
    }
    public  String getKod(){
        return this._name.substring(0,1)+_id;
    }
}

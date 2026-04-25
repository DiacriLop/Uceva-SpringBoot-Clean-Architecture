package uceva.cleanarchitecture.domain.entity;

public class Vehicle {

    public Integer id;
    public String brand;
    public String category;
    public Integer price;
    public Integer year;

    public Vehicle(Integer id, String brand, String category, Integer price, Integer year){
        this.id = id;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.year = year;
    }

}

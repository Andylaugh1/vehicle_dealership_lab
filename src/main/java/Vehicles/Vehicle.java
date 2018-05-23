package Vehicles;

public abstract class Vehicle {
    private int price;
    private String colour;
    private Engine engine;
    private Tyre[] tyres;

    public Vehicle(int price, String colour, Engine engine, Tyre[] tyres){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}

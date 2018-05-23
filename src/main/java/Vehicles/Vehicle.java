package Vehicles;

public abstract class Vehicle {
    private int price;
    private String colour;
    private Engine engine;
    private Tyre[] tyres;
    private FuelType fuelType;

    public Vehicle(int price, String colour, Engine engine, Tyre[] tyres, FuelType fuelType){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
        this.fuelType = fuelType;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getEngineSize() {
        return engine.getSize();
    }

    public int getTyreBrands() {
        return tyres.length;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}

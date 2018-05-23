package Vehicles;

public class Tyre {

    private TyreBrand brand;
    private double tread;

    public Tyre(TyreBrand brand){
        this.brand = brand;
        this.tread = brand.getTread();
    }

    public TyreBrand getBrand() {
        return brand;
    }

    public double getTread() {
        return tread;
    }

    public void reduceTread(){
        if(tread >= 0.1) tread -= 0.1;
    }

    public boolean isWornOut(){
        return tread <= 1.5;
    }
}

package Vehicles;

public enum TyreBrand {

    MICHELIN(2.0),
    PIRELLI(2.2),
    BRIDGESTONE(1.8);

    private final double tread;

    TyreBrand(double tread){
        this.tread = tread;
    }

    public double getTread(){
        return this.tread;
    }
}

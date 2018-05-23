package Vehicles;

public class Engine {

    private int size;
    private boolean engineState;

    public Engine(int size){
        this.size = size;
        this.engineState = false;
    }

    public int getSize() {
        return size;
    }

    public boolean getEngineState() {
        return engineState;
    }

    public void turnOn() {
        this.engineState = true;
    }

    public void turnOff(){
        this.engineState = false;
    }
}

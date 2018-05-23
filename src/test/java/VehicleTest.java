import Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VehicleTest {

    Vehicle vehicle;

    @Before
    public void before(){
        Tyre[] tyres = new Tyre[4];
        for (int i = 0 ; i < 4 ; i++) tyres[i] = new Tyre(TyreBrand.MICHELIN);
        vehicle = new Car(10000, "Blue", new Engine(1200), tyres);
    }

    @Test
    public void canGetPrice(){
        assertEquals(10000, vehicle.getPrice());
    }

    @Test
    public void canGetColour(){
        assertEquals("Blue", vehicle.getColour());
    }

}

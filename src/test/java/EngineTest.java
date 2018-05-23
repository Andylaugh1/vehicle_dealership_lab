import Vehicles.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EngineTest {

    Engine engine;

    @Before
    public void setup(){
        engine = new Engine(1200);
    }

    @Test
    public void hasSize(){
        assertEquals(1200, engine.getSize());
    }

    @Test
    public void hasStateIsOff(){
        assertFalse(engine.getEngineState());
    }

    @Test
    public void canTurnOn(){
        engine.turnOn();
        assertTrue(engine.getEngineState());
    }

    @Test
    public void canTurnOff(){
        engine.turnOn();
        engine.turnOff();
        assertFalse(engine.getEngineState());
    }
}

import Vehicles.Tyre;
import Vehicles.TyreBrand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TyreTest {

    Tyre tyre;
    Tyre tyre1;

    @Before
    public void before(){
        tyre = new Tyre(TyreBrand.MICHELIN);
    }

    @Test
    public void canGetBrand() {
        assertEquals(TyreBrand.MICHELIN, tyre.getBrand());
    }

    @Test
    public void canGetTread(){
        assertEquals(2.0, tyre.getTread(), 0.2);
    }

    @Test
    public void canReduceTread(){
        tyre.reduceTread();
        assertEquals(1.9, tyre.getTread(), 0.1);
    }

    @Test
    public void cannotReduceTreadBelow0(){
        for (int i=0 ; i < 40 ; i++) tyre.reduceTread();
        assertEquals(0, tyre.getTread(), 0.1);
    }

    @Test
    public void isWornOutYes(){
        for (int i=0 ; i < 5 ; i++) tyre.reduceTread();
        assertTrue(tyre.isWornOut());
    }

    @Test
    public void isWornOutNo(){
        assertFalse(tyre.isWornOut());
    }


}

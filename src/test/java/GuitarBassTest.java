import Instruments.GuitarBass;
import Instruments.GuitarBassType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarBassTest {

    GuitarBass guitarBass;

    @Before
    public void setUp(){
        guitarBass = new GuitarBass(850.00, 1200.00, "Fender", "Coronado XII", GuitarBassType.ELECTRIC12);
    }

    @Test
    public void canGetGuitarBassType(){
        assertEquals(GuitarBassType.ELECTRIC12, guitarBass.getGuitarBassType());
    }

    @Test
    public void canGetStringNumberFromEnum(){
        assertEquals(12, guitarBass.getStringNumberFromEnum());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Fender", guitarBass.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("Coronado XII", guitarBass.getModel());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(850.00, guitarBass.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(1200.00, guitarBass.getSalePrice(), 0.01);
    }

}

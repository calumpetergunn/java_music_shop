
import Instruments.GuitarBassType;
import Instruments.Keyboard;
import Instruments.KeyboardType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setUp(){
        keyboard = new Keyboard(1100.00, 1500.00, "Fender", "Rhodes", KeyboardType.RHODES);
    }

    @Test
    public void canGetGuitarBassType(){
        assertEquals(KeyboardType.RHODES, keyboard.getKeyboardType());
    }

    @Test
    public void canGetKeysNumberFromEnum(){
        assertEquals(73, keyboard.getNumberOfKeysFromEnum());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Fender", keyboard.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("Rhodes", keyboard.getModel());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(1100.00, keyboard.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(1500.00, keyboard.getSalePrice(), 0.01);
    }


}

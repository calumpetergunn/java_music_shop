import Instruments.Accessory;
import Instruments.instrumentTypes.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void setUp(){
        accessory = new Accessory(20.00, 35.00, "Guitar Pick Pack", AccessoryType.GUITARPICKS);

    }
    @Test
    public void canGetAccessoryName(){
        assertEquals("Guitar Pick Pack", accessory.getAccessoryName());
    }

    @Test
    public void canGetAccessoryType(){
        assertEquals(AccessoryType.GUITARPICKS, accessory.getAccessoryType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(15.00, accessory.calculateMarkup(), 0.01);
    }


}

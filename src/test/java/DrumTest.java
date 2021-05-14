import Instruments.Drums;
import Instruments.instrumentTypes.DrumType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void setUp(){
        drums = new Drums(400.00, 750.00, "Mapex", "Tornado III", DrumType.FULLKIT);
    }

    @Test
    public void canGetGuitarBassType(){
        assertEquals(DrumType.FULLKIT, drums.getDrumType());
    }

    @Test
    public void canGetStringNumberFromEnum(){
        assertEquals(12, drums.getSizeOfKitFromEnum());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Mapex", drums.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("Tornado III", drums.getModel());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(450.00, drums.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(750.00, drums.getSalePrice(), 0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Badum bum tssssshh", drums.playInstrument());
    }

}

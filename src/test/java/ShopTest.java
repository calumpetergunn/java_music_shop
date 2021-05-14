import Instruments.Drums;
import Instruments.GuitarBass;
import Instruments.Keyboard;
import Instruments.instrumentTypes.DrumType;
import Instruments.instrumentTypes.GuitarBassType;
import Instruments.instrumentTypes.KeyboardType;
import org.junit.Before;
import org.junit.Test;
import shop.Item;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item1, item2, item3;

    @Before
    public void setUp(){
        item1 = new GuitarBass(850.00, 1200.00, "Fender", "Coronado XII", GuitarBassType.ELECTRIC12);
        item2 = new Keyboard(1100.00, 1500.00, "Fender", "Rhodes", KeyboardType.RHODES);
        item3 = new Drums(400.00, 750.00, "Mapex", "Tornado III", DrumType.FULLKIT);
        shop = new Shop("Deano's Music Shack");
    }

    @Test
    public void canGetName(){
        assertEquals("Deano's Music Shack", shop.getShopName());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addItemToStock(item1);
        shop.addItemToStock(item2);
        shop.addItemToStock(item3);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItemToStock(item1);
        shop.addItemToStock(item2);
        shop.removeItemFromStock(item2);
        assertEquals(850.00, shop.getStockItem(0).getCostPrice(), 0.01);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canGetStockProfit(){
        shop.addItemToStock(item1);
        shop.addItemToStock(item2);
        shop.addItemToStock(item3);
        assertEquals(1100.00 ,shop.getStockProfit(), 0.01);
    }

}

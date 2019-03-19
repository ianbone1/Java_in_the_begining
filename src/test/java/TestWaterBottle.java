import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    //    * Create a water bottle class with a volume property.
    WaterBottle bottle;

    @Before
    public void before(){
        bottle=new WaterBottle();
    }

//    * The volume should start at 100.
    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

//    * Add a drink function that takes 10 from the volume each time it is called.
    @Test
    public void canDrink(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

//    * Create an empty function that brings the volume down to 0.
    @Test
    public void canEmpty(){
        bottle.drink();
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

//    * Create a fill function that fills the volume back to 100.
    @Test
    public void canFillFromEmpty(){
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canFillTopUp(){
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }


}

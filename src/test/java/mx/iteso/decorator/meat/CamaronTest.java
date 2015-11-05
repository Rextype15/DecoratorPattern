package mx.iteso.decorator.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Camaron;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CamaronTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco Camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = Camaron.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco Camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = Camaron.getDescription();
        assertEquals("Taco Normal de camaron", desc);
    }
}

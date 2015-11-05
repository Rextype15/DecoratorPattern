package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.*;
import mx.iteso.decorator.condiments.meat.Bistec;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.condiments.meat.Pastor;
import mx.iteso.decorator.condiments.meat.Pescado;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.Size;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {

    @Test
    public void testCost() {
        Taco taco = new TacoNormal();
        assertEquals(8.0, taco.cost(),0);
    }

    @Test
    public void CompleteTacoTest1() {
        Taco taco = new TacoNormal(Size.Mega);

        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);
        assertEquals("Taco mega en tortilla de maíz de chorizo con cebolla con cilantro", taco.getDescription());
    }

    @Test
    public void CompleteTacoTest2() {
        Taco taco = new TacoNormal(Size.Mini);

        taco = new TortillaHarina(taco);
        taco = new Pastor(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);
        taco = new Queso(taco);
        assertEquals("Taco mini en tortilla de harina de pastor con cebolla con cilantro con queso", taco.getDescription());
    }

    @Test
    public void VolcanTest() {
        Taco taco = new Volcan();

        taco = new TortillaHarina(taco);
        taco = new Bistec(taco);
        taco = new Cebolla(taco);
        assertEquals("Volcan en tortilla de harina de bistec con cebolla", taco.getDescription());
    }

    @Test
    public void QuesadillaTest(){
        Taco taco = new Quesadilla();

        taco = new TortillaHarina(taco);
        taco = new Pescado(taco);
        assertEquals("Quesadilla normal en tortilla de harina de Pescado", taco.getDescription());
    }


}

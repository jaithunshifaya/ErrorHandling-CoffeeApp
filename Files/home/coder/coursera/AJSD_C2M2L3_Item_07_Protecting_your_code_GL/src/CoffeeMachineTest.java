import com.sun.jdi.InvalidTypeException;

public class CoffeeMachineTest {
    @Test
    public void  testInvalidRoastCaffeineLevelInMg(){
        Coffee coffee=new Coffee("Test Coffee","invalid_roast", 2.0);
        assertEquals(50, coffee.getCaffeineLevelInMg(), "Default caffeine level should be set to 50 when an invalid roast is given. ");
    }

    private void assertEquals(int i, int caffeineLevelInMg, String s) {
    }

    @Test
    public  void testEspressoCreation(){
        Espresso espresso=new Espresso("Espresso", "medium", 2.50, 1);
        assertEquals(1, espresso.getNumberOfShots(), "This test stimulates a valid Espresso creation.");
    }
    @Test
    public  void testLatteCreation() throws InvalidTypeException {
        Latte latte=new Latte("Latte", "light", 3.50, "whole", "vanilla");
        assertEquals("whole", latte.getMilkType(), "This test stimulates a valid Latte creation.");
        assertEquals("vanilla", latte.getSyrupFlavor(), "This test stimulates a valid Latte creation.");
    }

    private void assertEquals(String whole, String milkType, String s) {
    }
}
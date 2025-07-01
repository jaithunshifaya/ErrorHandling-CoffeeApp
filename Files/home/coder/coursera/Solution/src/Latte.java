import com.sun.jdi.InvalidTypeException;

public class Latte extends Coffee {
    String milkType;
    String syrupFlavor;

   
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) throws IllegalArgumentException {
        super(name, roast, price);

        
        if (!("whole".equals(milkType)) && !("skim".equals(milkType)) && !("almond".equals(milkType)) && !("oat".equals(milkType))) {
            throw new IllegalArgumentException("please select a valid milk type!");
        }

        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    public void printLatteDetails() {
        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }
}

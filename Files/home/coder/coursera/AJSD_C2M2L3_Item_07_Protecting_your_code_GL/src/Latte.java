import java.util.Set;

public class Latte extends Coffee {
    String milkType;
    String syrupFlavor;
    private static final  Set<String> VALID_MILK_TYPES= Set.of("whole", "skim", "almond", "oat");


    public Latte(String name, String roast, double price, String milkType, String syrupFlavor)   {
        super(name, roast, price);
        if(!VALID_MILK_TYPES.contains(milkType)){
            System.out.println("Invalid milk type:" + milkType);
        }
        this.milkType = milkType;

        this.syrupFlavor = syrupFlavor;
    }

    public void printLatteDetails() {
        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is $" + price);
    }
    public String getMilkType(){
        return  milkType;
    }
    public String getSyrupFlavor(){
        return syrupFlavor;
    }
}


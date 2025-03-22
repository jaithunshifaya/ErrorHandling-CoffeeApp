public class Coffee {

    String name;
    String roast;
    int caffeineLevelInMg;
    double price;


    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;
        setCaffeineLevel();
    }



    public void setCaffeineLevel() {
        if(roast.equals("light")) {
            caffeineLevelInMg = 100;
        } else if(roast.equals("medium")) {
            caffeineLevelInMg = 75;
        } else if(roast.equals("dark")) {
            caffeineLevelInMg = 50;
        } else{
                caffeineLevelInMg=50;

        }
    }


    public void grindBeans() {
        System.out.println("\nGrinding beans for " + name + "...");
    }

    public void brewCoffee() {
        System.out.println("\nBrewing your favorite " + name + "...");
    }


    public void printInfo() {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffeineLevelInMg + " mg.");
    }
    public int getCaffeineLevelInMg(){
        return  caffeineLevelInMg;
    }
}

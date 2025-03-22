public class Espresso extends Coffee {

    int numberOfShots;


    public Espresso(String name, String roast, double price, int numberOfShots) throws ArithmeticException {
        super(name, roast, price);
        if(numberOfShots<=0){
            throw new ArithmeticException("Number of shots must be greater than zero.");
        }


        this.numberOfShots = numberOfShots;
    }

    public void printEspressoDetails() {
        System.out.println("You asked for " + numberOfShots + " servings!");
        System.out.println("Every serving of Espresso costs " +price + "$.Your total bill is " + (price * numberOfShots)+"$.");
    }
    public int getNumberOfShots(){
        return  numberOfShots;
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;


public class CoffeeMachine {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            try {
                int choice = keyboard.nextInt();

                switch (choice) {
                    case 1:
                        handleEspressoOrder(keyboard);
                        break;
                    case 2:
                        handleLatteOrder(keyboard);
                        break;
                    case 3:
                        System.out.println("Thank you for using the coffee machine!");
                        keyboard.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input.Please enter a number.");
                keyboard.next();
            }
        }
    }

    private static void handleEspressoOrder(Scanner keyboard) {
        String espressoName = "Espresso";
        double espressoPrice = 2.50;
        System.out.print("What Roast would you like? (light, medium, dark): ");
        String espressoRoast = keyboard.next();

        Espresso myEspresso = null;
        int numberOfShots = 1;

        while (true) {

            try {
                System.out.print("How many servings would you like? (a number please): ");
                numberOfShots = keyboard.nextInt();
                myEspresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error:Please enter a valid number of shots.");
                keyboard.next();
            } catch (ArithmeticException e) {
                System.out.println("Error:" + e.getMessage());
            }

        }
        if (myEspresso != null) {


            myEspresso.grindBeans();
            myEspresso.brewCoffee();
            myEspresso.printInfo();
            myEspresso.printEspressoDetails();
        }
    }

    private static void handleLatteOrder(Scanner keyboard) {
        String latteName = "Latte";
        double lattePrice = 3.50;

        System.out.print("What Roast would you like? (light, medium, dark): ");
        String latteRoast = keyboard.next();

        String milkType = "";
        String syrupFlavor = "no";
        Latte myLatte = null;
        while (true) {

                System.out.print("What milk type would you like? (whole, skim, almond, oat): ");
                milkType = keyboard.next();
                myLatte = new Latte(latteName, latteRoast, lattePrice, milkType, "vanilla");
                break;
            }

        System.out.print("Would you like syrup? (yes/ no): ");
        if (keyboard.next().equalsIgnoreCase("yes")) {
            System.out.print("Which flavor would you like? (vanilla, caramel, hazelnut): ");
            syrupFlavor = keyboard.next();
        }

            myLatte = new Latte(latteName, latteRoast, lattePrice, milkType, syrupFlavor);
            myLatte.grindBeans();
            myLatte.brewCoffee();
            myLatte.printInfo();
            myLatte.printLatteDetails();
       
    }

}




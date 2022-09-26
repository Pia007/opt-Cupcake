import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // create a new ArrayList which contains Cupcake objects and name it cupcakeMenu
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        // object Declaration and initialization
        // generic cupcake
        Cupcake cupcake = new Cupcake();

        // red velvet cupcake
        RedVelvet redVelvet = new RedVelvet();

        // chocolate cupcake
        Chocolate chocolate = new Chocolate();

        // Pricing
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" +
                "\nthe menu but we need to decide on pricing");

        // create a scanner object
        // wrapped in a try block to avoid having to close the scanner
        try (
                Scanner input = new Scanner(System.in)) {
            System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");

            // type() method - print the description of the generic cupcake
            cupcake.type();

            // print how much would you like to charge for the generic cupcake
            System.out.println("How much would you like to charge for the cupcake?" +
                    "\n(Input a numerical number taken to 2 decimals)");

            // string variable to stor the user input
            String priceText = input.nextLine();

            // convert the string to a double
            double price = Double.parseDouble(priceText);

            // call the setPrice() method, with price as the parameter
            cupcake.setPrice(price);

            //red velvet cupcake
            System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
            redVelvet.type();
            System.out.println("How much would you like to charge for the cupcake?" +
                    "\n(Input a numerical number taken to 2 decimals)");
            priceText = input.nextLine();
            price = Double.parseDouble(priceText);
            redVelvet.setPrice(price);


            // chocolate cupcake
            System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
            chocolate.type();
            System.out.println("How much would you like to charge for the cupcake?" +
                    "\n(Input a numerical number taken to 2 decimals)");
            priceText = input.nextLine();
            price = Double.parseDouble(priceText);
            chocolate.setPrice(price);
        }
        // add the cupcake objects to the cupcakeMenu ArrayList
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
    }
}

// Generic Cupcake: create a new class named Cupcake.
class Cupcake {

    // fields
    public double price;

    // Methods: getters
    public double getPrice() {
        return price;
    }

    // Methods: setters
    public void setPrice(double price) {
        this.price = price;
    }

    // Create a public function named type that prints “A basic, generic cupcake,
    // with vanilla frosting” and returns void.
    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

// create a Redvelvet class and Chocolate class that extends Cupcake
// inherits getPrice(), setPrice() and type() from cupcake

class RedVelvet extends Cupcake {

    // override type() to print “A red velvet cupcake, with cream cheese frosting”
    @Override
    public void type() {
        System.out.println("A red velvet cupcake, with cream cheese frosting");
    }
}

class Chocolate extends Cupcake {

    // override type() to print “A chocolate cupcake, with chocolate frosting”
    @Override
    public void type() {
        System.out.println("A chocolate cupcake, with chocolate frosting");
    }
}
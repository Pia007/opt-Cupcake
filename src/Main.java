import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // create a new ArrayList which contains Cupcake objects and name it cupcakeMenu
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        // object declaration
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        // Cupcake Pricing
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" +
                "\nthe menu but we need to decide on pricing");

        // create a scanner object
        Scanner input = new Scanner(System.in);

        // standard cupcake
        System.out.println("\nWe are deciding on the price for our standard cupcake. Here is the description: ");
        cupcake.type();

        System.out.println("\nHow much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimals)");

        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        //red velvet cupcake
        System.out.println("\nWe are deciding on the price for our red velvet cupcake. Here is the description: ");

        redVelvet.type();

        System.out.println("\nHow much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimals)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        // chocolate cupcake
        System.out.println("\nWe are deciding on the price for our chocolate cupcake. Here is the description: ");

        chocolate.type();

        System.out.println("\nHow much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimals)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        // add the cupcake objects to the cupcakeMenu ArrayList
        cupcakeMenu.add(cupcake);

        cupcakeMenu.add(redVelvet);

        cupcakeMenu.add(chocolate);


        // create a new ArrayList which contains Drink object and name it drinkMenu
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        // object Declaration and initialization
        // generic drink
        Drink water = new Drink();

        // soda object
        Soda soda = new Soda();

        // milk object
        Milk milk = new Milk();

        // Drink Pricing
        System.out.println("\nWe are in the middle of creating the drink menu. We currently have three drinks on" +
                "\nthe menu but we need to decide on pricing");

        // type() method - print the description of the water drink
        water.type();

        // print how much would you like to charge for the water drink
        System.out.println("\nHow much would you like to charge for the water?" +
                "\n(Input a numerical number taken to 2 decimals)");

        // reuse scanner to get the user input
        priceText = input.nextLine();

        // store the user input in the price variable
        price = Double.parseDouble(priceText);

        // call the setPrice() method, with price as the parameter
        water.setPrice(price);

        // soda drink
        System.out.println("\nWe are deciding on the price for our soda. Here is the description: ");
        soda.type();
        System.out.println("\nHow much would you like to charge for the soda?" +
                "\n(Input a numerical number taken to 2 decimals)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        // milk drink
        System.out.println("\nWe are deciding on the price for our milk. Here is the description: ");
        milk.type();
        System.out.println("\nHow much would you like to charge for the milk?" +
                "\n(Input a numerical number taken to 2 decimals)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        // add the drink objects to the drinkMenu ArrayList
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
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
        System.out.println("\nA basic, generic cupcake, with vanilla frosting");
    }
}

// create a Redvelvet class and Chocolate class that extends Cupcake
// inherits getPrice(), setPrice() and type() from cupcake

class RedVelvet extends Cupcake {

    // override type() to print “A red velvet cupcake, with cream cheese frosting”
    @Override
    public void type() {
        System.out.println("\nA red velvet cupcake, with cream cheese frosting");
    }
}

class Chocolate extends Cupcake {

    // override type() to print “A chocolate cupcake, with chocolate frosting”
    @Override
    public void type() {
        System.out.println("\nA chocolate cupcake, with chocolate frosting");
    }
}

// create Drink class
class Drink {

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

    //Methods: type()
    public void type() {
        System.out.println("Bottle of water.");
    }
}

//create classes Soda and Milk that extends Drink
// inherits getPrice(), setPrice() and type() from Drink
class Soda extends Drink {

    // override type() to print “A can of soda”
    @Override
    public void type() {
        System.out.println("A can of soda");
    }
}

class Milk extends Drink {

    // override type() to print “A glass of milk”
    @Override
    public void type() {
        System.out.println("A glass of milk");
    }
}


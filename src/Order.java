import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


// PART 3:
public class Order {

    // create a public constructor function named Order with the
    // following parameters: an ArrayList of Cupcake objects named cupcakeMenu, and
    // an ArrayList of Drink objects named drinkMenu.

    // constructor
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {

        // Print "Hello customer. Would you like to place an order?(Y or N)"
        System.out.println("\nHello customer. Would you like to place an order?(Y or N)");

        // create scanner object
        Scanner input = new Scanner(System.in);

        // assign the input to a String variable named placeOrder
        String placeOrder = input.nextLine();

        // create an ArrayList of Objects named order
        // using Object as the type because we don't know what the user will order
        // list does not have to be all the same type
        ArrayList<Object> order = new ArrayList<Object>();

        // check if order is equal to "Y" or "y"
        // else print "Have a nice day then."
        if (placeOrder.equalsIgnoreCase("Y")) {

            // add LocalDate.now() to order.
            order.add(LocalDate.now());

            // add LocalTime.now() to order.
            order.add(LocalTime.now());

            // print "Here is the menu".
            System.out.println("\nHere is the menu");

            // print "Cupcakes:"
            System.out.println("\nCupcakes:");

            // int itemNumber and set it equal to 0
            int itemNumber = 0;

            // iterate over the cupcakeMenu ArrayList
            for (int i = 0; i < cupcakeMenu.size(); i++) {
                // increment itemNumber by 1.
                itemNumber++;

                // print the itemNumber and the description of the cupcake.
                System.out.print(itemNumber + ". ");
                cupcakeMenu.get(i).type();

                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());

                // Print a new line.
                System.out.println();
            }

            // print "Drinks:"
            System.out.println("Drinks:");

            // iterate over the drinkMenu ArrayList
            for (int i = 0; i < drinkMenu.size(); i++) {
                // increment itemNumber by 1.
                itemNumber++;

                // Print the itemNumber and the description of the drink.
                System.out.print(itemNumber + ". ");
                drinkMenu.get(i).type();

                System.out.println("Price: $" + drinkMenu.get(i).getPrice());

                // Print a new line.
                System.out.println();
            }

            // create boolean called ordering and set it equal to true
            boolean ordering = true;

            // while ordering is true

            while(ordering) {
                // print "What would you like to order? Please use the number associated with each item to order."
                System.out.println("\nWhat would you like to order? Please use the number associated with each item to order.");

                // create an int variable named orderChoice and set it equal to input.nextInt()
                int orderChoice = input.nextInt();

                // call input.nextLine() to clear the buffer
                input.nextLine();

                // check if orderChoice = 1
                // if truthy, add the 1st item from the cupcakeMenu ArrayList to the order ArrayList
                // print "Item added to order."
                // else if for orderChoices 2, 3, 4, 5, or 6
                // if truthy, add the 2nd item from the cupcakeMenu ArrayList to the order ArrayList
                // print "Item added to order."
                // else, print "Sorry, we don't seem to have that on the menu."
                if (orderChoice == 1) {

                    order.add(cupcakeMenu.get(0));
                    System.out.println("Item added to order.");

                } else if (orderChoice == 2) {

                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item added to order.");

                } else if (orderChoice == 3) {

                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item added to order.");

                } else if (orderChoice == 4) {

                    order.add(drinkMenu.get(0));
                    System.out.println("Item added to order.");

                } else if (orderChoice == 5) {

                    order.add(drinkMenu.get(1));
                    System.out.println("Item added to order.");

                } else if (orderChoice == 6) {

                    order.add(drinkMenu.get(2));
                    System.out.println("Item added to order.");

                } else {
                    System.out.println("Sorry, we don't seem to have that on the menu.");
                }

                // print "Would you to continue ordering? (Y or N)"
                System.out.println("\nWould you like to continue ordering? (Y or N)");

                //  set a String obj placeOrder equal to input.nextLine() // already created
                String keepOrdering = input.nextLine();

                // check if keepOrdering is equal to "Y" or "y"
                // if truthy, set ordering to true
                // else, set ordering to false
                if (!keepOrdering.equalsIgnoreCase("Y")) {
                    ordering = false;
                }
            }

            //PART 4a

            // print the first item in the order ArrayList
            System.out.println("Order Date: " + order.get(0));

            // print the second item in the order ArrayList
            System.out.println("Order Time: " + order.get(1));

            // create a double variable named subtotal and set it equal to 0
            Double subtotal = 0.0;

            // iterate over the order ArrayList
            // if order at i is cupcake menu at 0
            // get the value at cupcake menu item at 0
            // use getPrice() to print the price of the cupcake
            // add the price of the cupcake to the subtotal
            // use else ifs to do the same for
            // cupcake menu items indexes 1 and 2
            // drink menu items indexes 0, 1, 2

            for (int i = 2; i < order.size(); i ++) {
                if( order.get(i).equals(cupcakeMenu.get(0))) {

                    cupcakeMenu.get(0).type();
                    System.out.println(cupcakeMenu.get(0).getPrice());
                    subtotal += cupcakeMenu.get(0).getPrice();

                } else if (order.get(i).equals(cupcakeMenu.get(1))) {

                    cupcakeMenu.get(1).type();
                    System.out.println(cupcakeMenu.get(1).getPrice());
                    subtotal += cupcakeMenu.get(1).getPrice();

                } else if (order.get(i).equals(cupcakeMenu.get(2))) {

                    cupcakeMenu.get(2).type();
                    System.out.println(cupcakeMenu.get(2).getPrice());
                    subtotal += cupcakeMenu.get(2).getPrice();

                } else if (order.get(i).equals(drinkMenu.get(0))) {

                    drinkMenu.get(0).type();
                    System.out.println(drinkMenu.get(0).getPrice());
                    subtotal += drinkMenu.get(0).getPrice();

                } else if (order.get(i).equals(drinkMenu.get(1))) {

                    drinkMenu.get(1).type();
                    System.out.println(drinkMenu.get(1).getPrice());
                    subtotal += drinkMenu.get(1).getPrice();

                } else if (order.get(i).equals(drinkMenu.get(2))) {

                    drinkMenu.get(2).type();
                    System.out.println(drinkMenu.get(2).getPrice());
                    subtotal += drinkMenu.get(2).getPrice();
                }
            }

            System.out.println("Subtotal: $" + subtotal);

            // Part 4d: call the constructor function for the CreateFile class.
            new CreateFile();

            // Part 4d: call the constructor function for the WriteToFile class,
            // passing in the parameter order
            new WriteToFile(order);

        } else {
            System.out.println("Have a nice day then.");
        }
    }
}

// Part 4b
// create class named CreateFile after the public class Order
class CreateFile {

    // public constructor
    public CreateFile() {

        // try catch block, with a catch parameter of IOException e
        try {

            // create a file object named salesData and set it equal to a new File object named salesData.txt
            File salesData = new File("salesData.txt");

            // create an if statement with the parameter salesData.createNewFile()
            // if new file is created, pint "File created:  and the file name"
            // otherwise, print "File already exists."
            if (salesData.createNewFile()) {
                System.out.println("File created: " + salesData.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

// Part 4c
// create class named WriteFile after the public class Order
class WriteToFile {

    // create a public constructor with ArrayListObject order as the parameter
    public WriteToFile(ArrayList<Object> order) {

        // try catch block, with a catch parameter of IOException e
        try {

            // create a new FileWriter object, fw
            // set it equal to new FileWriter Object  with the parameters salesData.txt and true (allows appending to the file)
            FileWriter fw = new FileWriter("salesData.txt", true);

            // create a new PrintWriter object, salesWriter
            // set it equal to new PrintWriter Object with the parameter FileWriter, fw
            PrintWriter salesWriter = new PrintWriter(fw);

            // iterate over salesWriter and print each element in order
            for (int i = 0; i < order.size(); i++) {
                salesWriter.println(order.get(i));
            }

            // close salesWriter
            salesWriter.close();

            System.out.println("Successfully wrote to the file");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}



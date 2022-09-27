import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    // create a public constructor function named Order with the
    // following parameters: an ArrayList of Cupcake objects named cupcakeMenu, and
    // an ArrayList of Drink objects named drinkMenu.


    // constructor
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {

        // Print "Hello customer. Would you like to place an order?(Y or N)"
        System.out.println("Hello customer. Would you like to place an order?(Y or N)");

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
            System.out.println("Here is the menu");

            // print "Cupcakes:"
            System.out.println("\nCupcakes:");

            // int itemNumber and set it equal to 0
            int itemNumber = 0;

            // iterate over the cupcakeMenu ArrayList
            for (int i = 0; i < cupcakeMenu.size(); i++) {
                // increment itemNumber by 1.
                itemNumber++;

                // print the itemNumber and the description of the cupcake.
                System.out.println(itemNumber);
                cupcakeMenu.get(i).type();

                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());

                // Print a new line.
                System.out.println();
            }

            // print "Drinks:"
            System.out.println("Drinks:" + "\n");

            // iterate over the drinkMenu ArrayList
            for (int i = 0; i < drinkMenu.size(); i++) {
                // increment itemNumber by 1.
                itemNumber++;

                // Print the itemNumber and the description of the drink.
                System.out.println(itemNumber);
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
                System.out.println("What would you like to order? Please use the number associated with each item to order.");

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

                    order.add(cupcakeMenu.get(3));
                    System.out.println("Item added to order.");

                } else if (orderChoice == 5) {

                    order.add(cupcakeMenu.get(4));
                    System.out.println("Item added to order.");

                } else if (orderChoice == 6) {

                    order.add(cupcakeMenu.get(5));
                    System.out.println("Item added to order.");

                } else {
                    System.out.println("Sorry, we don't seem to have that on the menu.");
                }

                // print "Would you to continue ordering? (Y or N)"
                System.out.println("Would you to continue ordering? (Y or N)");

                //  set a String obj placeOrder equal to input.nextLine() // already created
                String keepOrdering = input.nextLine();

                // check if keepOrdering is equal to "Y" or "y"
                // if truthy, set ordering to true
                // else, set ordering to false
                if (!keepOrdering.equalsIgnoreCase("Y")) {
                    ordering = false;
                }
            }
        } else {
            System.out.println("Have a nice day then.");
        }
    }
}


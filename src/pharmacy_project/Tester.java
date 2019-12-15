package pharmacy_project;

import java.util.Scanner;


public class Tester {
    Scanner in = new Scanner(System.in);
 public void order() {
    OUTER:
        while (true) {
            System.out.print("1. List Of Medicine | 2. Place order | 3. Display Receipt | 4. Quit" + "\n" +
                    "Please in put the choice (1-4):");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    // if choice is 1 list prices

                    listPrices();
                    break;
                case 2:
                    // place order containing several pizza types and their quantities
                    
                    placeOrder(in); 
                    break;
                case 3:
                    // display receipt from two arrays storing pizza type and quantity of each pizza type

                    displayReceipt();
                    break;
                case 4:
                    break OUTER;
                default:
                    break;
            }
        }

    }

    final static String[] medicine = new String[]{ // each pizza type as a constant inside this array, access is via it's position in the array
    };
    final static double[] price = new double[]{ // prize for each pizza inside the pizza array
    };

    public static void listPrices() {
        for (int i = 1; i <= medicine.length; i++) {
            System.out.println(i + "." + medicine[i - 1] + " Price: " + price[i - 1]);
            // loop through pizza array and display the price from the price array
        }
    }

    // array to store receipt pizza type
    public static int[] receipt_medicine_name = new int[100];
    // array to store quantity of each pizza type
    public static int[] receipt_medicine_quantity = new int[receipt_medicine_name.length];

    public static void displayReceipt() {

        // get pizza inside receipt pizza type using pizza constant array and get the price as well then multiply by the quantity
        // these arrays are initialized with fixed size 100 so the rest unused items are with value 0, we need to stop looping when the value becomes 0
        for (int i = 0; i <= receipt_medicine_name.length - 1 && receipt_medicine_name[i] != 0; i++) {
            System.out.println("You ordered " + receipt_medicine_quantity[i] 
                    + " " + medicine[receipt_medicine_name[i] - 1] + "\n" + "Your total price is " 
                    + (price[receipt_medicine_name[i] - 1] * receipt_medicine_quantity[i]));

        }

    }

    public static void placeOrder(Scanner in) {

        int iterator_receipt = 0;

        while (true) { // keep looping until full order is placed
            listPrices();
            System.out.print("Choose your Medicine name: ");

            int medicine_choice = in.nextInt();
            if (medicine_choice <= 0 || medicine_choice > 15) {
                System.out.println("You must choose a Medicine's number from the recomended list price ONLY");
                break;
            }
            receipt_medicine_name[iterator_receipt] = medicine_choice; // put inside receipt medicine name array out selected pizza

            int quantity = 0;

            while (true) {
                System.out.print("Enter quantity from 1-10: ");

                quantity = in.nextInt();

                if (quantity >= 1 && quantity <= 10) {
                    break;
                }

            }

            receipt_medicine_quantity[iterator_receipt] = quantity; // put inside receipt quantity array the chosen quantity
            iterator_receipt++; // used for storing receipt data for each medicine name
            System.out.println("Do you want to order more? (Y or N)");//asking user to order more or not

            char choice_cont = (char) in.next().trim().charAt(0);
            if (choice_cont == 'y' || choice_cont == 'Y') {// contain talking order if y or Y is selected
                continue;
            } else { // stop taking orders if any letter is selected
                break;
            }

        }

        return;
}
}

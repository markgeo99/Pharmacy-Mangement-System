package pharmacy_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    public Scanner in = new Scanner(System.in);
    private Pharmacy pharmacy = new Pharmacy();
    private String pharmacy_filename = "Medicine In Pharmacy.txt";
    private String inventory_filename = "Medicine In Inventory.txt";
    private ArrayList<Integer> NewQ = new ArrayList<>();
    private ArrayList<String> ID = new ArrayList<>();
    private ArrayList<String> neworder = new ArrayList<>();
    private ArrayList<Double> totalprice = new ArrayList<>();

    public Order() {

    }

    public void Function() {
        String choose = null;
        System.out.println("1-List of Medicine"
                + "\n2-Place Order"
        );
        choose = in.next();
        System.out.println("--------------------------------");
        switch (choose) {
            case "1":
                pharmacy.Show_Medicine_in_Pharmacy();
                System.out.println("--------------------------------");
                break;

            case "2":
                Make_Order_plus_Receipt();
                System.out.println("--------------------------------");
                break;

            default:
                System.out.println("Try Again!");
                System.out.println("--------------------------------");

        }
    }

    public double getPrice_By_ID(String input) {
        double PriceD = 0;
        try {
            Scanner sc = new Scanner(new File(pharmacy_filename));
            sc.useDelimiter("[,\n]");

            String Name = null;
            String Price = null;
            String ID = null;
            String Quantity = null;

            while (sc.hasNext()) {
                ID = sc.next();
                Name = sc.next();
                Price = sc.next();
                Quantity = sc.next();

                if (input.equals(ID)) {
                    PriceD = Double.parseDouble(Price);
                    return PriceD;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
            System.out.println("--------------------------------");
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println("--------------------------------");
        }
        return PriceD;
    }

    public String getName_by_ID(String input) {
        String NameS = null;
        try {
            Scanner sc = new Scanner(new File(pharmacy_filename));
            sc.useDelimiter("[,\n]");

            String Name = null;
            String Price = null;
            String ID = null;
            String Quantity = null;

            while (sc.hasNext()) {
                ID = sc.next();
                Name = sc.next();
                Price = sc.next();
                Quantity = sc.next();

                if (input.equals(ID)) {
                    NameS = Name;
                    return NameS;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
            System.out.println("--------------------------------");
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println("--------------------------------");
        }
        return NameS;

    }

    public int getQuantity_by_ID(String input) {
        int QuantityI = 0;
        try {
            Scanner sc = new Scanner(new File(pharmacy_filename));
            sc.useDelimiter("[,\n]");

            String Name = null;
            String Price = null;
            String ID = null;
            String Quantity = null;

            while (sc.hasNext()) {
                ID = sc.next();
                Name = sc.next();
                Price = sc.next();
                Quantity = sc.next();

                if (input.equals(ID)) {
                    QuantityI = Integer.parseInt(Quantity);

                    return QuantityI;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
            System.out.println("--------------------------------");
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println("--------------------------------");
        }

        return QuantityI;
    }

    public boolean Compare_Quantity(int newQ, String id) {

        boolean qv = false;
        int oldQ = getQuantity_by_ID(id);

        if (newQ > oldQ) {
            System.out.println("--------------------------------");
            System.out.println("Wrong , The New Quantity is Bigger than the Medicine Quantity");
            System.out.println("--------------------------------");
            return qv;

        } else if (newQ <= oldQ) {
            System.out.println("--------------------------------");
            System.out.println("Done!");
            System.out.println("--------------------------------");
            qv = true;
            return qv;

        } else {
            System.out.println("Error!");
            System.out.println("--------------------------------");
            return qv;

        }

    }

    public double getTotalPrice(int newQ, String id) {
        double result = newQ * getPrice_By_ID(id);
                totalprice.add(result);

        return result;
    }

    public int ReceiptTotalPrice() {
        int total = 0;
       for (int i = 0; i < totalprice.size(); i++) {
            total += totalprice.get(i);

        }
        return total;
        

    }

  public void Display_Receipt() {
        int qn;
        String id;
    
        for (int i = 0; i < ID.size(); i++) {

                qn = NewQ.get(i);
                id = ID.get(i);
                System.out.println("--------------------------------");
                System.out.println("**********************************");
                System.out.println("You Order\n" + qn + " " + getName_by_ID(id) + "\nTotal : " + getTotalPrice(qn, id));
                
                System.out.println("**********************************");


           }

        }

    public void Make_Order_plus_Receipt() {
        String id = null;
        int newQ = 0;
        int x = 1;
       
        do {
            

            System.out.println("Select ID the Ordered Medicine :  ");
            id = in.next();
            ID.add(id);
            if(getName_by_ID(id)!=null){
            System.out.println("Medicine '" + id + "' : " + getName_by_ID(id) + "," + getPrice_By_ID(id) + "," + getQuantity_by_ID(id));
            }else{
                System.out.println("There is no Medicine with this ID");
                System.out.println("--------------------------------");
                Function();
            }
            System.out.println("Enter Quantity of orderd medicine : ");
            newQ = in.nextInt();

            if (Compare_Quantity(newQ, id)) {

                NewQ.add(newQ);

            }

           // getTotalPrice(newQ, id);
            System.out.println("1-Add more orders\n2-Display Receipt ");
            x = in.nextInt();
            System.out.println("--------------------------------");
        } while (x == 1);
        {
        }
        Display_Receipt();
        System.out.println("Total All Ordered Medicine : " + ReceiptTotalPrice());
           

    }
    }
    


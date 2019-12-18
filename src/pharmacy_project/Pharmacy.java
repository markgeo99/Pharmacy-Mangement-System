package pharmacy_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pharmacy {
    
    public Scanner in = new Scanner(System.in);
    private String pharmacy_filename = "Medicine In Pharmacy.txt";
    private String inventory_filename = "Medicine In Inventory.txt";
    private String Name;
    private String Price;
    private String ID;
    private String Quantity;
    private String line = null;
    private int Phone;
    private Address Address_Of_Pharmacy = new Address("Nasr City", "Rab3a", "El Shaf3y", 9, 7);

    

    public Pharmacy() {
    }

    public Pharmacy(int Phone, String Name, String Price, String ID, String Quantity) {
        this.Phone = Phone;
        this.Name = Name;
        this.Price = Price;
        this.ID = ID;
        this.Quantity = Quantity;
    }

    public void Add_Medicine_to_Pharmacy_From_Inventory(String name) throws IOException {
        try {
            FileWriter fw = new FileWriter(pharmacy_filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(new File(inventory_filename));
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

                if (name.equals(Name)) {
                    System.out.println(ID + " " + Name + " " + Price + " " + Quantity);
                    bw.write(ID + ",");
                    bw.write(Name + ",");
                    bw.write(Price + ",");
                    bw.write(Quantity + "\n");
                    System.out.println("Done!");
                    System.out.println("--------------------------------");
                    bw.close();

                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
            System.out.println("--------------------------------");
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println("--------------------------------");
        }
    }

    public void Show_Medicine_in_Pharmacy() {
        line = ID + Name + Price + Quantity;
        try {
            Scanner sc = new Scanner(new File(pharmacy_filename));
            FileReader fr = new FileReader(pharmacy_filename);
            BufferedReader br = new BufferedReader(fr);
            if (!sc.hasNext()) {
                System.out.println("This File is empty");
                System.out.println("--------------------------------");
            }
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                System.out.println("--------------------------------");
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "There is no File to Show Data");
            System.out.println("--------------------------------");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + pharmacy_filename + "'");
            System.out.println("--------------------------------");
        } catch (Exception ex) {
            System.out.println("Medicine doesn't exist");
            System.out.println("--------------------------------");
        }

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

}

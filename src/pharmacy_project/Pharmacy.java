package pharmacy_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pharmacy {

    private String pharmacy_filename = "Medicine In Pharmacy.txt";
    private Inventory inventory = new Inventory();
    
    private int Phone;
    private Address Address_Of_Pharmacy = new  Address("Nasr City","Rab3a", "El Shaf3y", 9, 7);

    private String Name;
    private String Price;
    private String ID;
    private String Quantity;

    private String line = null;

    Scanner in = new Scanner(System.in);

    public Pharmacy() {
    }

    public void Order() {

}


    

    public void Add_Medicine_to_Pharmacy_From_Inventory(ArrayList<Medicine> m, int pos) {
        try {
            FileWriter fw = new FileWriter(pharmacy_filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            Name = m.get(pos).getNamet();
            bw.write(Name + ",");
            Price = m.get(pos).getPricet();
            bw.write(Price +",");
            ID = m.get(pos).getIDt();
            bw.write(ID +",");
            Quantity = m.get(pos).getQuantityt();
            bw.write(Quantity );
            bw.close();
        } catch (IOException ex) {
            System.out.println("Input isn't Valid");
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

    public void Show_Medicine_in_Pharmacy() {
        line = "|Name : " + Name
                + "|\t Price : " + Price
                + "|\t ID :" + ID
                + "|\t Quantity :" + Quantity;
        try {
            FileReader fr = new FileReader(pharmacy_filename);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + pharmacy_filename + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + pharmacy_filename + "'");

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



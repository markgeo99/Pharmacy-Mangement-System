package pharmacy_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pharmacy {

    private int Phone;
    private Address Address;

    private String Name;
    private double Price;
    private int ID;
    private int Quantity;

    private String fileName = "Medicine In Pharmacy.txt";
    private String line = null;

    Scanner in = new Scanner(System.in);

    public Pharmacy() {
    }

    public void Order() {

    }

    public void Add_Medicine_to_Pharmacy_Frome_Inventry(ArrayList<Medicine> m, int pos) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            Name = m.get(pos).getNamet();
            bw.write("\n"+Name +"\t"+ "|"+"\t");
            Price = m.get(pos).getPricet();
            bw.write(Price +"\t"+ "|"+"\t");
            ID = m.get(pos).getIDt();
            bw.write(ID +"\t"+ "|"+"\t");
            Quantity = m.get(pos).getQuantityt();
            bw.write(Quantity +"\t"+ "|"+"\n");
            bw.write("========================================================\n");
            bw.close();
        } catch (IOException ex) {
            System.out.println("Input isn't Valid");
        }

        System.out.println("Done!");
    }

    public void Show_Medicine_in_Pharmacy() {
        line = "|Name : " + Name
                + "|\t Price : " + Price
                + "|\t ID :" + ID
                + "|\t Quantity :" + Quantity;
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");

        }

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

}

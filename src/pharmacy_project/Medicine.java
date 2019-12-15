package pharmacy_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Medicine {

    String inventory_filename = "Medicine In Inventory.txt";
    private String line = null;
    private String Namet;
    private String Pricet;
    private String IDt;
    private String Quantityt;
    public Scanner in = new Scanner(System.in);

    public void Add_Medicine_on_Inventory() {

        try {
            FileWriter fw = new FileWriter(inventory_filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Enter Name for the New Medicine : ");
            Namet = in.next();
            bw.write(Namet + ",");

            System.out.println("Enter Price for the New Medicine");
            Pricet = in.next();
            if (Pattern.matches("[0-9]+", Pricet)) {
                bw.write(Pricet + ",");
            } else {
                System.out.println("Wrong ,DataType Error");
                System.exit(0);
            }

            System.out.println("Enter ID for the New Medicine");
            IDt = in.next();
            if (Pattern.matches("[0-9]+", IDt)){
                bw.write(IDt + ",");
            }else {
                System.out.println("Wrong ,DataType Error");
                System.exit(0);
            }
            System.out.println("Enter Quantity for the New Medicine");
            Quantityt = in.next();
            if (Pattern.matches("[0-9]+", Quantityt)){
                bw.write(Quantityt + ",");
            }else {
                System.out.println("wrong ,DataType Error");
                System.exit(0);
            }
            bw.close();

        } catch (IOException ex) {
            System.out.println("Error reading file '" + inventory_filename + "'");
        } catch (Exception ex) {
            System.out.println("Input isn't Valid");
        }

    }

    public void Show_Medicine_in_Inventory() {

        line = "|Name : " + Namet
                + "|\t Price : " + Pricet
                + "|\t ID :" + IDt
                + "|\t Quantity :" + Quantityt;
        try {
            FileReader fr = new FileReader(inventory_filename);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + inventory_filename + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + inventory_filename + "'");

        }

    }

    public String getNamet() {
        return Namet;
    }

    public void setNamet(String Name) {
        this.Namet = Name;
    }

    public String getPricet() {
        return Pricet;
    }

    public void setPricet(String Pricet) {
        this.Pricet = Pricet;
    }

    public String getIDt() {
        return IDt;
    }

    public void setIDt(String IDt) {
        this.IDt = IDt;
    }

    public String getQuantityt() {
        return Quantityt;
    }

    public void setQuantityt(String Quantityt) {
        this.Quantityt = Quantityt;
    }

}

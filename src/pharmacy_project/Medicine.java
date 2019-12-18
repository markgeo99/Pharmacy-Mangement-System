package pharmacy_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Medicine {

    public Scanner in = new Scanner(System.in);
    private String inventory_filename = "Medicine In Inventory.txt";
    private String line = null;
    private String Namet;
    private String IDt;
    private String Pricet;
    private String Quantityt;
    private static int ID = 1;

    public Medicine() {
    }

    public Medicine(String Namet, String IDt, String Pricet, String Quantityt) {
        this.Namet = Namet;
        this.IDt = IDt;
        this.Pricet = Pricet;
        this.Quantityt = Quantityt;
    }

   

    public void Add_Medicine_on_Inventory() {

        try {
            FileWriter fw = new FileWriter(inventory_filename, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(ID++ + ",");

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

            System.out.println("Enter Quantity for the New Medicine");
            Quantityt = in.next();
            if (Pattern.matches("[0-9]+", Quantityt)) {
                bw.write(Quantityt + "\n");
                System.out.println("--------------------------------");
            } else {
                System.out.println("Wrong ,DataType Error");
                System.out.println("--------------------------------");

                System.exit(0);
            }
            bw.close();

        } catch (IOException ex) {
            System.out.println("Error reading file '" + inventory_filename + "'");
            System.out.println("--------------------------------");
        } catch (Exception ex) {
            System.out.println("Input isn't Valid");
            System.out.println("--------------------------------");
        }

    }

    public void Show_Medicine_in_Inventory() {

        line = IDt + Namet + Pricet + Quantityt;
        try {
            Scanner sc = new Scanner(new File(inventory_filename));
            FileReader fr = new FileReader(inventory_filename);
            BufferedReader br = new BufferedReader(fr);
            if (!sc.hasNext()) {
                System.out.println("This File is empty");
            }
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                System.out.println("--------------------------------");
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("--------------------------------");
            System.out.println("There is no File to Show Data");
            System.out.println("--------------------------------");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + inventory_filename + "'");
            System.out.println("--------------------------------");

        } catch (Exception ex) {
            System.out.println("Medicine doesn't exist");
            System.out.println("--------------------------------");
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

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Medicine.ID = ID;
    }

    

    public String getQuantityt() {
        return Quantityt;
    }

    public void setQuantityt(String Quantityt) {
        this.Quantityt = Quantityt;
    }

}

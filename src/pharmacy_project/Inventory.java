package pharmacy_project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Inventory {

    String pharmacy_filename = "Medicine In Pharmacy.txt";
    String inventory_filename = "Medicine In Inventory.txt";
    Scanner in = new Scanner(System.in);

    public Inventory() {
    }

    public void D(String filename) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);

        } catch (Exception ex) {
            System.out.println("Error!");
        }
    }

    public void Delete(String filename, String removedTerm) throws IOException {
        String tempfile = "temp.txt";
        File oldfile = new File(filename);
        File newfile = new File(tempfile);
        String Name = "";
        String Price = "";
        String ID = "";
        String Quantity = "";

        try {
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner sc = new Scanner(new File(filename));
            sc.useDelimiter("[,\n]");

            while (sc.hasNext()) {
                Name = sc.next();
                Price = sc.next();
                ID = sc.next();
                Quantity = sc.next();

                if (!removedTerm.equals(Name)) {
                    pw.println(Name + "," + Price + "," + ID + "," + Quantity);
                }
            }
            sc.close();
            pw.flush();
            pw.close();
            oldfile.delete();
            File dump = new File(filename);
            newfile.renameTo(dump);
            System.out.println("-----------------------");

        } catch (Exception ex) {
            System.out.println("File Not Found!");
            System.out.println("-----------------------");

        }
    }

    public int Search(String filename, String name) {
        try {
            Scanner sc = new Scanner(new File(filename));
            sc.useDelimiter("[,\n]");

            String Name = null;
            String Price = null;
            String ID = null;
            String Quantity = null;

            while (sc.hasNext()) {
                Name = sc.next();
                Price = sc.next();
                ID = sc.next();
                Quantity = sc.next();

                if (name.equals(Name)) {
                    System.out.println(Name + " " + Price + " " + ID + " " + Quantity);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return 0;

    }

}

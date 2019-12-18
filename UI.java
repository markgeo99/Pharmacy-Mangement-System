package pharmacy_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    Scanner in = new Scanner(System.in);

    public void MainList() {
    
        }

    public int Delete_Medicine_From_Inventry(ArrayList<Medicine> m) {
        int x = 0;
        for (int i = 0; i < m.size(); i++) {
            Search_Medicine_in_Inventory(m);
            String name = null;
            System.out.println("Enter Medicine Name : ");
            if (name.equals(m.get(i).getNamet())) {
                System.out.println(m.get(i).getNamet());
                return i = x;

            } else {
                return -1;
            }

        }
        return 0;

    }
    
    public int Delete_Medicine_From_Pharmacy(ArrayList<Pharmacy> p) {
        int x = 0;
        for (int i = 0; i < p.size(); i++) {
            Search_Medicine_in_Pharmacy(p);
            String name = null;
            System.out.println("Enter Medicine Name : ");
            if (name.equals(p.get(i).getName())) {
                System.out.println(p.get(i).getName());
                return i = x;

            } else {
                return -1;
            }

        }
        return 0;

    }

    public int Search_Medicine_in_Pharmacy(ArrayList<Pharmacy> p) {
        String Name;
        int i;
        boolean flag = false;
        System.out.println("Enter Medicine Name :");
        System.out.println("-----------------------");
        Name = in.next();
        for (i = 0; i < p.size(); i++) {
            if (Name.equals(p.get(i).getName())) {
                System.out.println("Name :" + p.get(i).getName());
                System.out.println("Price :" + p.get(i).getPrice());
                System.out.println("Quantity :" + p.get(i).getQuantity());
                System.out.println("ID :" + p.get(i).getID());
                System.out.println("-----------------------");
                flag = true;
                System.out.println("Done!");
                return i;

            } else {
                System.out.println("This Medicine doesn't Exist");
            }
        }
        if (flag == false) {
            System.out.println("Not Found ! ");
            return -1;
        } else {
            System.out.println("Found ! ");

            return i;
        }
    }

    public int Search_Medicine_in_Inventory(ArrayList<Medicine> m) {
        String Name;    
        int i;
        boolean flag = false;
        System.out.println("Enter Medicine Name :");
        System.out.println("-----------------------");
        Name = in.next();
        for (i = 0; i < m.size(); i++) {
            if (Name.equals(m.get(i).getNamet())) {
                System.out.println("Name :" + m.get(i).getNamet());
                System.out.println("Price :" + m.get(i).getPricet());
                System.out.println("Quantity :" + m.get(i).getQuantityt());
                System.out.println("ID :" + m.get(i).getIDt());
                System.out.println("-----------------------");
                flag = true;
                System.out.println("Done!");
                break;
            } else {
                flag = false;
            }
        }

        if (flag == false) {
            System.out.println("Not Found ! ");
            return -1;
        } else {
            System.out.println("Found ! ");

            return i;
        }
    }


}

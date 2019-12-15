package pharmacy_project;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Admin extends Person {
    private  String pharmacy_filename = "Medicine In Pharmacy.txt";
    private  String inventory_filename = "Medicine In Inventory.txt";
    private Supplier supplier = new Supplier();
    private Inventory inventory = new Inventory();
    private  Pharmacy pharmacy = new Pharmacy();
    public Scanner in = new Scanner(System.in);
    private ArrayList<Medicine> m = new ArrayList<>();
    private ArrayList<Pharmacy> p = new ArrayList<>();
    private String[] user_name = {"admin", "Admin", "1"};
    private String[] password = {"1", "1", "1"};
    private Person person = new Person() {};
    

    public Admin() {
    }

    
    public Admin(String Name, int phone, String E_mail) {
        super(Name, phone, E_mail);
    }



    public void Admin_System() throws IOException {
        int x = 1;
        int choose;
        do {
            System.out.println("-------------------------");

            System.out.println(" 1-Add Medicine to Inventory "
                    + "\n 2-Show Medicines in Inventory"
                    + "\n 3-Search for Medicine in Inventory "
                    + "\n 4-Delete Medicine From Inventory"
                    + "\n 5-Add Medicine to Pharmacy From Inventory"
                    + "\n 6-Show Medicine in Pharmacy"
                    + "\n 7-Search for medicine in Pharmacy"
                    + "\n 8-Delete Medicine From Pharmacy"
                    + "\n 8-Make Order"
                    + "\n 9-Show Supplier Data");

            System.out.println("-------------------------");
            System.out.println("Choose your function : ");
            System.out.println("-------------------------");

            choose = in.nextInt();
            m.add(new Medicine());

            switch (choose) {
                case 1:
                    System.out.println("-----------------------");
                    m.add(new Medicine());
                    m.get(m.size() - 1).Add_Medicine_on_Inventory();
                    System.out.println("-----------------------");
                    break;

                case 2:
                    System.out.println("-----------------------");
                    m.get(m.size() - 1).Show_Medicine_in_Inventory();
                    System.out.println("-----------------------");
                    break;

                case 3:
                    System.out.println("-----------------------");
                    String name3;
                    System.out.println("Enter Medicine Name :");
                    name3 = in.next();
                    inventory.Search(inventory_filename, name3);
                    System.out.println("-----------------------");
                    break;

                case 4:
                    System.out.println("-----------------------");
                    String name9;
                    System.out.println("Enter Name of Medicine :");
                    name9 = in.next();
                    System.out.println("-----------------------");
                    inventory.Delete(inventory_filename, name9);
                    break;

                case 5:
                    System.out.println("-----------------------");
                    p.add(new Pharmacy());
                    String name4;
                    System.out.println("Enter Medicine Name :");
                    name4 = in.next();
                    int position;
                    position = inventory.Search(inventory_filename, name4);
                    p.get(p.size() - 1).Add_Medicine_to_Pharmacy_From_Inventory(m, position);
                    System.out.println("-----------------------");
                    break;

                case 6:
                    for (int i = 0; i < p.size(); i++) {
                        p.get(i).Show_Medicine_in_Pharmacy();
                    }
                    break;

                case 7:
                    System.out.println("-----------------------");
                    String name6;
                    System.out.println("Enter Medicine Name :");
                    name6 = in.next();
                    inventory.Search(pharmacy_filename, name6);
                    System.out.println("-----------------------");
                    break;
                case 8:
                    pharmacy.Order();
                    break;

                case 9:
                    supplier.setName("Supplier");
                    supplier.setEmail("Supplier@gamil.com");
                    supplier.setPhone(0121000102);
                    System.out.println(supplier.Display_Supplier_Data());
                    System.out.println("-----------------------");
                    break;

                default:
                    System.out.println("-----------------------");
                    System.out.println("Try Again! ");
                    System.out.println("-----------------------");

            }
            System.out.println("1-Back to main list"
                    + "\n2-Exit");
            System.out.println("-------------------------");

            x = in.nextInt();
        } while (x == 1);
        System.out.println("Thank You for using our Pharmacy System \nGood Luck!");;

    }

    public boolean Admin_LogIn() {
        boolean flag = false;
        String user_name1;
        System.out.println("Enter your UserName :");
        user_name1 = in.next();

        String password1;
        System.out.println("Enter your Password :");
        password1 = in.next();

        for (int i = 0; i < getUser_name().length; i++) {
            if (user_name1.equals(getUser_name()[i]) && password1.equals(getPassword()[i])) {
                System.out.println("-----------------------");
                System.out.println("Welcome to Pharmacy Mangement System");
                System.out.println("-----------------------");
                setName("Admin");
                setE_mail("Admin@gmail.com");
                setPhone(01010555055);
                System.out.println(Person_Data());
                System.out.println();
                flag = true;

            }
        }
        return flag;
    }

    public String[] getUser_name() {
        return user_name;
    }

    public void setUser_name(String[] user_name) {
        this.user_name = user_name;
    }

    public String[] getPassword() {
        return password;
    }

    public void setPassword(String[] password) {
        this.password = password;
    }

    }



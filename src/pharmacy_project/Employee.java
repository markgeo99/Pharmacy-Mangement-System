package pharmacy_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee extends Person {
    
    public Scanner in = new Scanner(System.in);
    private String pharmacy_filename = "Medicine In Pharmacy.txt";
    private String inventory_filename = "Medicine In Inventory.txt";
    private Inventory inventory = new Inventory();
    private Pharmacy pharmacy = new Pharmacy();
    private Order order = new Order();
    private ArrayList<Medicine> m = new ArrayList<Medicine>();
    private ArrayList<Pharmacy> p = new ArrayList<Pharmacy>();
    private String[] user_name = {"user", "User", "2"};
    private String[] password = {"2", "2", "2"};
    private Person person = new Person() {
    };

    public Employee() {
    }

    public Employee(String Name, int phone, String E_mail) {
        super(Name, phone, E_mail);
    }

    public void Empolyee_System() throws IOException {
        int x = 1;
        String choose;
        try {
            do {
                System.out.println("The Main List:");
                System.out.println(" 1-Add Medicine to Inventory "
                        + "\n 2-Show Medicines in Inventory"
                        + "\n 3-Search for Medicine in Inventory "
                        + "\n 4-Delete Medicine From Inventory"
                        + "\n 5-Add Medicine to Pharmacy From Inventory"
                        + "\n 6-Show Medicine in Pharmacy"
                        + "\n 7-Search for medicine in Pharmacy"
                        + "\n 8-Delete Medicine From Pharmacy"
                        + "\n 9-Make Order"
                );
                System.out.println("--------------------------------");

                System.out.println("Choose your function : ");

                choose = in.next();
                System.out.println("--------------------------------");

                m.add(new Medicine());

                switch (choose) {
                    case "1":
                        m.add(new Medicine());
                        m.get(m.size() - 1).Add_Medicine_on_Inventory();
                        break;

                    case "2":

                        m.get(m.size() - 1).Show_Medicine_in_Inventory();
                        break;

                    case "3":
                        String name3;
                        System.out.println("Enter Medicine Name :");
                        name3 = in.next();
                        inventory.Search(inventory_filename, name3);

                        break;

                    case "4":
                        String name9;

                        System.out.println("Enter Name of Medicine :");
                        name9 = in.next();
                        inventory.Delete(inventory_filename, name9);
                        break;

                    case "5":

                        String name = null;

                        System.out.println("Enter Medicine name : ");
                        name = in.next();
                        System.out.println("--------------------------------");
                        pharmacy.Add_Medicine_to_Pharmacy_From_Inventory(name);
                        break;

                    case "6":
                        p.add(new Pharmacy());
                        p.get(p.size() - 1).Show_Medicine_in_Pharmacy();
                        break;

                    case "7":
                        String name6;
                        System.out.println("Enter Medicine Name :");
                        name6 = in.next();
                        System.out.println("--------------------------------");
                        inventory.Search(pharmacy_filename, name6);
                        break;
                    case "8":
                        String name8;
                        System.out.println("Enter Name of Medicine :");
                        name8 = in.next();
                        System.out.println("--------------------------------");
                        inventory.Delete(pharmacy_filename, name8);
                        break;
                    case "9":
                        order.Function();
                        break;

                    default:
                        System.out.println("Try Again! ");
                        System.out.println("--------------------------------");

                }
                System.out.println("1-Back to Main List"
                        + "\nElse to Exit");
                x = in.nextInt();
                System.out.println("--------------------------------");

            } while (x == 1);
            System.out.println("**_-Thank You for using our Pharmacy System_-** \nGood Luck!");
            System.out.println("--------------------------------");

        } catch (InputMismatchException ex) {
            System.out.println("This DataType isn't Allowed");
            System.out.println("--------------------------------");

        }

    }

    public boolean Empolyee_LogIn() {
        boolean flag = false;
        String user_name1;
        System.out.println("--------------------------------");
        System.out.println("Enter your UserName :");
        user_name1 = in.next();

        String password1;
        System.out.println("Enter your Password :");
        password1 = in.next();
        System.out.println("--------------------------------");

        for (int i = 0; i < getUser_name().length; i++) {
            if (user_name1.equals(getUser_name()[i]) && password1.equals(getPassword()[i])) {
                System.out.println("**-_Welcome to Pharmacy Mangement System_-**");
                System.out.println("--------------------------------");
                setName("Employe");
                setE_mail("Employe@gmail.com");
                setPhone(01010555055);
                System.out.print(Person_Data()+"\n");
                System.out.println("--------------------------------");
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

    public String Display_Employee_Data() {
        return "Employee{" + "user_name=" + user_name + ", password=" + password + '}';
    }

}

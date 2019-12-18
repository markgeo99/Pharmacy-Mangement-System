package pharmacy_project;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Admin extends Person {

    UI ui = new UI();
    Pharmacy pah = new Pharmacy();
    Medicine med = new Medicine();
    public Scanner in = new Scanner(System.in);
    private ArrayList<Medicine> m = new ArrayList<Medicine>();
    private ArrayList<Pharmacy> p = new ArrayList<Pharmacy>();
    private String[] user_name = {"admin", "Admin", "1"};
    private String[] password = {"1", "1", "1"};
    private Supplier supplier;

    public Admin() {
    }

    public Admin(Supplier supplier) {
        this.supplier = supplier;
    }

    public Admin(Supplier supplier, String Name, int Id, String[] Password, String[] UserName) {
        super(Name, Id, Password, UserName);
        this.supplier = supplier;
    }

    public void Admin_System() throws IOException {
        int x = 1;
        int choose;
        do {
            System.out.println("-------------------------");

            System.out.println(" 1-Add medicine to inventry "
                    + "\n 2-Show medicine in inventry"
                    + "\n 3-Search for medicine in inventry "
                    + "\n 4-Add medicine to Pharmacy frome inventory"
                    + "\n 5-Show medicine in Pharmacy"
                    + "\n 6-Search for medicine in Pharmacy"
                    + "\n 7-Get Order"
                    + "\n 8-Show Supplier Information");

            System.out.println("-------------------------");
            System.out.println("Choose your function : ");
            System.out.println("-------------------------");

            choose = in.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("-----------------------");
                    m.add(new Medicine());
                    m.get(m.size() - 1).Add_Medicine_on_Inventry();
                    System.out.println("-----------------------");
                    break;

                case 2:
                    System.out.println("-----------------------");
                    m.get(m.size() - 1).Show_Medicine_in_Inventry();
                    System.out.println("-----------------------");
                    break;

                case 3:
                    System.out.println("-----------------------");
                    ui.Search_Medicine_in_Inventory(m);
                    System.out.println("-----------------------");
                    break;

                case 4:
                    System.out.println("-----------------------");
                    p.add(new Pharmacy());
                    int position;
                    position = ui.Search_Medicine_in_Inventory(m);

                    p.get(p.size() - 1).Add_Medicine_to_Pharmacy_Frome_Inventry(m, position);
                    System.out.println("-----------------------");
                    break;

                case 5:
                    for (int i = 0; i < p.size(); i++) {
                        p.get(i).Show_Medicine_in_Pharmacy();
                    }

                    break;

                case 6:
                    System.out.println("-----------------------");
                    ui.Search_Medicine_in_Pharmacy(p);
                    System.out.println("-----------------------");
                    break;

                case 7:
                    pah.Order();
                    break;

                case 8:
                    supplier.toString();
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String Display_Admin_Data() {
        return "Admin{" + "user_name=" + user_name + ", password=" + password + ", supplier=" + supplier + '}';
    }
     @Override
    public String[] getUser_Name() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}

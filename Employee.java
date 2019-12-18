package pharmacy_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Person {

    UI ui = new UI();
    Pharmacy pah = new Pharmacy();
    Scanner in = new Scanner(System.in);
    private ArrayList<Medicine> m = new ArrayList<Medicine>();
    private ArrayList<Pharmacy> p = new ArrayList<Pharmacy>();
    private String[] user_name = {"user", "User", "2"};
    private String[] password = {"2", "2", "2"};

    public Employee() {
    }

    public Employee(String Name, int Id, String[] Password, String[] UserName) {
        super(Name, Id, Password, UserName);
    }

    public void Empolyee_System() throws IOException {
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
            );

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
        System.out.println("");

    }

    public boolean Empolyee_LogIn() {
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

    @Override
    public String[] getPassword() {
        return password;
    }

    @Override
    public void setPassword(String[] password) {
        this.password = password;
    }

    public String Display_Employee_Data() {
        return "Employee{" + "user_name=" + user_name + ", password=" + password + '}';
    }

    @Override
    public String[] getUser_Name() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

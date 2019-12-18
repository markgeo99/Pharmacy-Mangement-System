package pharmacy_project;

import java.io.IOException;
import java.util.Scanner;

public class UI {

    public Scanner in = new Scanner(System.in);
    private Admin admin = new Admin();
    private Employee employee = new Employee();
    

    public void MainList() throws IOException {
        
        String choose = null;
        System.out.println("--------------------------------");
        System.out.println("1-Admin \n2-Employee\nChoose:");
        choose = in.next();
        switch (choose) {
            case "1":
                try {
                    while (!admin.Admin_LogIn()) {
                        System.out.println("This UserName or Password is not valid\nTry Again!");
                        System.out.println("--------------------------------");
                    }

                } catch (Exception ex) {
                    System.out.println("Error!");
                    System.out.println("--------------------------------");
                }
                admin.Admin_System();
                break;
            case "2":
                try {
                    while (!employee.Empolyee_LogIn()) {
                        System.out.println("This UserName or Password is not valid\nTry Again!");
                        System.out.println("--------------------------------");
                    }
                } catch (Exception ex) {
                    System.out.println("Error!");
                    System.out.println("--------------------------------");
                }
                employee.Empolyee_System();
                break;
            default:
                System.out.println("Try Again!");
                System.out.println("--------------------------------");
                MainList();
        }
    }

}

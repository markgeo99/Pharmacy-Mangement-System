package pharmacy_project;

import java.io.IOException;
import java.util.Scanner;

public class Pharmacy_Project {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Admin a = new Admin();
        Employee e = new Employee();
        int choose = 0;
        System.out.println("1-Admin \n2-Employee\nChoose:");
        choose = in.nextInt();
        switch (choose) {
            case 1:
                try {
                    a.Admin_LogIn();
                } catch (Exception ex) {
                    System.out.println("this username or password isn't valid");
                }
                a.Admin_System();
                break;
            case 2:
                try {
                    e.Empolyee_LogIn();
                } catch (Exception ex) {
                    System.out.println("this username or password isn't valid");
                }
                e.Empolyee_System();
        }

    }
}

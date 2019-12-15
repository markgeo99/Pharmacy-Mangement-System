package pharmacy_project;

import java.io.IOException;
import java.util.Scanner;


public class UI {
    Scanner in = new Scanner(System.in);
    private Admin a = new Admin();
    private Employee e = new Employee();
        
    public void MainList() throws IOException {
        int choose = 0;
        System.out.println("1-Admin \n2-Employee\nChoose:");
        choose = in.nextInt();
        switch (choose) {
            case 1:
                try {
                    while(!a.Admin_LogIn()){
            System.out.println("Wrong Entry,Try again");
            
        }
                    
                } catch (Exception ex) {
                    System.out.println("This Username or Password isn't valid");
                }
                a.Admin_System();
                break;
            case 2:
                try {
                    while(!e.Empolyee_LogIn()){
            System.out.println("Wrong Entry,Try again");
        }
                } catch (Exception ex) {
                    System.out.println("This Username or Password isn't valid");
                }
                e.Empolyee_System();
        }
        }

    

}

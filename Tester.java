package pharmacy_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    Scanner in = new Scanner(System.in);

    Admin a = new Admin();
    Employee e = new Employee();
    
    
  

    public void LogIn() {
        
        if(a.Admin_LogIn()){
            a.Admin_System();
        }

    }
}

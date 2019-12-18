package pharmacy_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventry {

    Scanner in = new Scanner(System.in);
    Medicine med = new Medicine();
    ArrayList<Medicine> m = new ArrayList<Medicine>();
    ArrayList<Pharmacy> p = new ArrayList<>();
    UI ui = new UI();

    public Inventry() {
    }

    public void Show() throws IOException {
        med.Show_Medicine_in_Inventry();
    }

    public void Add() throws IOException {
        med.Add_Medicine_on_Inventry();
    }
}

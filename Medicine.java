package pharmacy_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;

public class Medicine {
private String fileName = "Medicine In Inventry.txt";
private String line = null;
    private String Namet;
    private double Pricet;
    private int IDt;
    private int Quantityt;
    public Scanner in = new Scanner(System.in);

    public void Add_Medicine_on_Inventry()   {
            
        try {
            
            FileWriter fw = new FileWriter(fileName,true);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Enter Name for the New Medicine : ");
            Namet = in.next();
            bw.write("\n"+Namet +"\t"+ "|"+"\t");
            
            System.out.println("Enter Price for the New Medicine");
            Pricet = in.nextDouble();
            bw.write(Pricet +"\t"+ "|"+"\t");
            
            System.out.println("Enter ID for the New Medicine");
            IDt = in.nextInt();
            bw.write(IDt +"\t"+ "|"+"\t");
            
            System.out.println("Enter Quantity for the New Medicine");
            Quantityt = in.nextInt();
            bw.write(Quantityt +"\t"+ "|"+"\n");
            bw.write("========================================================\n");
            bw.close();

            
            
        } catch (IOException ex) {
            System.out.println("Input isn't Valid");
        }
        
       

    }

    public void Show_Medicine_in_Inventry() throws IOException  {

        line="|Name : " + Namet  
                + "|\t Price : " + Pricet
                + "|\t ID :" + IDt
                + "|\t Quantity :" + Quantityt;
       try{
           FileReader fr = new FileReader(fileName);
           BufferedReader br = new BufferedReader(fr);
           while((line = br.readLine()) != null) {
                System.out.println(line);
            }   
           br.close();
       }catch (FileNotFoundException ex){
           System.out.println(
                "Unable to open file '" + 
                fileName + "'");
       }catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");   
                

        
       }  

    }
    

    public String getNamet() {
        return Namet;
    }

    public void setNamet(String Name) {
        this.Namet = Name;
    }

    public double getPricet() {
        return Pricet;
    }

    public void setPricet(double Price) {
        this.Pricet = Price;
    }

    public int getIDt() {
        return IDt;
    }

    public void setIDt(int ID) {
        this.IDt = ID;
    }

    public int getQuantityt() {
        return Quantityt;
    }

    public void setQuantityt(int Quantity) {
        this.Quantityt = Quantity;
    }

}

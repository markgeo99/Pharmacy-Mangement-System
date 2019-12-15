package pharmacy_project;

public class Supplier {

    private Address Address_Of_Supplier   = new Address("Masr El Gdeda", "St-Fatima", "Ahmad amean",15, 2);
            
    private String Name;
    private String Email;
    private int phone;
    

    public Supplier() {
    }

    public Supplier( String Name, String Email, int phone) {
       
        this.Name = Name;
        this.Email = Email;
        this.phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;

    }

    public Address getAddress_Of_Supplier() {
        return Address_Of_Supplier;
    }

    public void setAddress_Of_Supplier(Address Address_Of_Supplier) {
        this.Address_Of_Supplier = Address_Of_Supplier;
    }

    
    public String Display_Supplier_Data() {
        return "Supplier{\n"+ Address_Of_Supplier + "\n Name=" + Name + "\n Email=" + Email + "\n phone=" + phone + '}';
    }

  


}

package pharmacy_project;

public class Supplier {

    private Address Address;
    private String Name;
    private String Email;
    private int phone;

    public Supplier() {
    }

    public Supplier(Address Address, String Name, String Email, int phone) {
        this.Address = Address;
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

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Supplier{" + "Address=" + Address + ", Name=" + Name + ", Email=" + Email + ", phone=" + phone + '}';
    }

}

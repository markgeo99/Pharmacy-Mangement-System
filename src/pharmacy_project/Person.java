package pharmacy_project;

public abstract class Person {

    private String Name;
    private int phone;
    private String E_mail;

    public Person() {

    }

    public Person(String Name, int phone, String E_mail) {
        this.Name = Name;
        this.phone = phone;
        this.E_mail = E_mail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String Person_Data() {
        return "Name =" + Name + "\nPhoneNymber =" + phone + "\nE_mail =" + E_mail;
    }

}

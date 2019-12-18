package pharmacy_project;

public  abstract class Person {
    
    private String Name;
    private int Id;
    private String[] Password;
    private String[] User_Name;

    public Person() {

    }

    public Person(String Name, int Id, String[] Password, String[] UserName) {
        this.Name = Name;
        this.Id = Id;
        this.Password = Password;
        this.User_Name = UserName;
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public  abstract String[] getPassword();

    public void setPassword(String[] Password) {
        this.Password = Password;
    }

    public  abstract String[] getUser_Name();

    public void setUser_Name(String[] User_Name) {
        this.User_Name = User_Name;
    }
}

    

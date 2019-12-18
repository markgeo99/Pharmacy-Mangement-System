package pharmacy_project;

public class Address {

    private String City;
    private String Block;
    private String Street;
    private int Apartment;
    private int Building;

    public Address() {

    }

    public Address(String City, String Block, String Street, int Apartment, int Building) {

        this.City = City;
        this.Block = Block;
        this.Street = Street;
        this.Apartment = Apartment;
        this.Building = Building;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getBlock() {
        return Block;
    }

    public void setBlock(String block) {
        Block = block;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getApartment() {
        return Apartment;
    }

    public void setApartment(int apartment) {
        Apartment = apartment;
    }

    public int getBuilding() {
        return Building;
    }

    public void setBuilding(int building) {
        Building = building;
    }

    @Override
    public String toString() {
        return "Address{" + "City=" + City + ", Block=" + Block + ", Street=" + Street + ", Apartment=" + Apartment + ", Building=" + Building + '}';
    }

}

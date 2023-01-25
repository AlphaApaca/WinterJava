package Task2_Bike;

public abstract class Vehicle {
    private int wheels;
    private String material;
    private String name;
    private String company;

    public Vehicle(){
        this.wheels = 2;
        this.material = "steel";
        this.name = "Nintendo Switch";
        this.company = "Sony";
    }
    public Vehicle(int wheels, String material, String name, String company){
        this.wheels = wheels;
        this.material = material;
        this.name = name;
        this.company = company;
    }

    public int getWheels() {
        return wheels;
    }

    public String getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public abstract void run();

}

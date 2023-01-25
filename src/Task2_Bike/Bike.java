package Task2_Bike;

public class Bike {
    private int wheels;
    private String material;
    private String name;
    private String company;

    public Bike(){
        this.wheels = 2;
        this.material = "steel";
        this.name = "Nintendo Switch";
        this.company = "Sony";
    }
    public Bike(int wheels, String material, String name, String company){
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

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return "Bick{" +
                "wheels=" + wheels +
                ", material='" + material + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

package Task2_Bike;

public class Bike extends Vehicle{

    private String type;

    public Bike(){
        super();
        this.type = "Road";
    }

    public Bike(int wheels, String material, String name, String company, String type){
        super(wheels, material, name, company);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    @Override
    public void run() {
        System.out.print("This bike is running by "+ getWheels() + "wheel");
        if(getWheels()!=1)
            System.out.print("s");
        System.out.println();
    }
    @Override
    public String toString() {
        return "Bike{" +
                "wheels=" + getWheels() +
                ", material='" + getMaterial() + '\'' +
                ", name='" + getName() + '\'' +
                ", company='" + getCompany() + '\'' +
                "type='" + type + '\'' +
                '}';
    }
}

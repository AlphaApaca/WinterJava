package Task2_Bike;

public class SharedBike extends Bike{
    private boolean borrowed;
    private long id;
    private int gas;

    final int QUANTITY = 50;

    public SharedBike(){
        super();
        this.borrowed = false;
        this.id = 10000;
        this.gas = QUANTITY;
    }

    public SharedBike(boolean borrowed, long id) {
        super();
        this.borrowed = borrowed;
        this.id = id;
        this.gas = QUANTITY;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public long getId() {
        return id;
    }

    public int getGas() {
        return gas;
    }

    public void borrowBike(){
        if(!this.borrowed){
            if(gas!=0){
                this.borrowed = true;
                this.gas--;
            }else {
                System.out.println("This bike is flat. " +
                        "You need to inflate it.");
            }
        }else {
            System.out.println("This bike has been borrowed");
        }
    }
    public void returnBike(){
        if(this.borrowed){
            this.borrowed = false;
        }else {
            System.out.println("This bike has been returned");
        }
    }
    public void pump(){
        this.gas = QUANTITY;
    }

    public static void printInfo(SharedBike sharedBike){
        System.out.println("The id of this bike: "+ sharedBike.getId() + "\n"
        + "The rest of gas: " + sharedBike.getGas());
        if(sharedBike.isBorrowed()){
            System.out.println("This bike is being borrowed");
        }else {
            System.out.println("This bike is available");
        }
    }
    @Override
    public String toString() {
        return "SharedBike{" +
                ", material='" + getMaterial() + '\'' +
                ", name='" + getName() + '\'' +
                ", company='" + getCompany() + '\'' +
                "borrowed=" + borrowed +
                ", id=" + id +
                ", gas=" + gas +
                '}';
    }
}

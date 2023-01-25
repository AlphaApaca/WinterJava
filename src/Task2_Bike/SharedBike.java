package Task2_Bike;

public class SharedBike extends Bike implements Bell{
    private boolean borrowed;
    final long id;
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
                System.out.println("Welcome to use");
                belling();
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
            belling();
            System.out.println("The ride has been completed" + "\n"
            + "Looking forward to your next use");
        }else {
            System.out.println("This bike has been returned");
        }
    }
    public void pump(){
        this.gas = QUANTITY;
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
    @Override
    public void belling() {
        System.out.println("Belling: \"So, Nvidia, f**k u(英伟达我爱你)\"");
    }
}

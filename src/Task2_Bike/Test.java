package Task2_Bike;

public class Test {
    public static void main(String[] args){
        SharedBike apple = new SharedBike();
        System.out.println(apple.toString());
        System.out.println("#------------------------------------------#");
        //test toString();

        SharedBike banana = new SharedBike(false,10001);
        while (banana.getGas() != 0){
            banana.borrowBike();
            System.out.println();
            banana.returnBike();
            System.out.println();
        }
        System.out.println("#------------------------------------------#");
        //run out the gas;

        banana.returnBike();
        System.out.println("#------------------------------------------#");
        //test returnBike() when the bike is returned;

        banana.borrowBike();
        printInfo(banana);
        System.out.println("#------------------------------------------#");
        //test borrowBike() and printInfo() when the gas is empty;

        banana.pump();
        printInfo(banana);
        System.out.println("#------------------------------------------#");
        //test pump() and printInfo();

        banana.borrowBike();
        banana.borrowBike();
        printInfo(banana);
        System.out.println("#------------------------------------------#");
        //test borrowBike() when the bike is borrowed;
    }
    public static void printInfo(SharedBike sharedBike){
        System.out.println("The id of this bike: "+ sharedBike.getId() + "\n"
                + "The rest of gas: " + sharedBike.getGas());
        if(sharedBike.isBorrowed()){
            System.out.println("This bike is being borrowed");
        }else {
            if(sharedBike.getGas() != 0){
                System.out.println("This bike is available");
            }else {
                System.out.println("This bike isn't borrowed, but it is flat, you need to inflate it.");
            }
        }
    }
}

public class App {
    public static void main(String[] args){
        // Assuming we are creating a manual SUV for this example
        SUV fortuner = new SUV("Fortuner", false);

        fortuner.printTransmissionType();
        fortuner.move(30, 0);
        fortuner.accelerate(10);

        System.out.println("Current Gear: " + fortuner.getCurrentGear());
        System.out.println("Current Direction: " + fortuner.getCurrentDirection());
    }
}

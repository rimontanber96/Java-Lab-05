package bd.edu.bubt.cse.interfaces;

public class HybridVehicle implements ILandVehicle, IWaterVehicle{
    private int noOfWheels;
    private int noOfTurbines;
    private int noOfSpins;
    private double wheelRadius;


    public HybridVehicle() {

    }

    public HybridVehicle(int noOfWheels, int noOfTurbines, int noOfSpins,
                         double wheelRadius) {
        this.noOfWheels = noOfWheels;
        this.noOfTurbines = noOfTurbines;
        this.noOfSpins = noOfSpins;
        this.wheelRadius = wheelRadius;
    }

    public int getNoOfWheels() {
        return this.noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfTurbines() {
        return this.noOfTurbines;
    }

    public void setNoOfTurbines(int noOfTurbines) {
        this.noOfTurbines = noOfTurbines;
    }

    public int getNoOfSpins() {
        return noOfSpins;
    }

    public void setNoOfSpins(int noOfSpins) {
        this.noOfSpins = noOfSpins;
    }

    public double getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(double wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public void showDetails(){
        System.out.println("---------------------------------------");
        System.out.println("|          Hybrid Vehicle Info:       |");
        System.out.println("|-------------------------------------|");
        System.out.println("| # of Wheels: " + this.noOfWheels);
        System.out.println("| # of Turbines: " + this.noOfTurbines);
        System.out.println("| # of Spins: " + this.noOfSpins);
        System.out.println("| Radius of Wheels: " + this.wheelRadius + " M.");
        System.out.println("| Completed Distance: " +
                            this.calcDistance()/1000 + " Km.");
        System.out.println("---------------------------------------");
    }

    public void move(){
        System.out.println("The Hybrid Vehicle is moving using it's " +
                            this.noOfWheels + " wheels and " +
                            this.noOfTurbines + " turbines.");
    }

    public void brake(){
        System.out.println("The Hybrid Vehicle is stopping using it's brake.");
    }

    public void horn(){
        System.out.println("The Hybrid Vehicle is making noise using it's " +
                           "horn.");
    }

    public void enlight(){
        System.out.println("The Hybrid Vehicle is enlighting using it's " +
                "light.");
    }

    public double calcDistance(){
        return this.noOfSpins * (2 * IVehicle.PI * this.wheelRadius);
    }
}

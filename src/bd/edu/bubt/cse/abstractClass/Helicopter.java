package bd.edu.bubt.cse.abstractClass;

public class Helicopter extends AirVehicle {
    public Helicopter(){

    }

    public void fly(){
        System.out.println("The Helicopter is Flying..."+getNoOfPropellers());
    }
}

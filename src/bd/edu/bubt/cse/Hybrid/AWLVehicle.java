package bd.edu.bubt.cse.Hybrid;

import bd.edu.bubt.cse.interfaces.Air;
import bd.edu.bubt.cse.interfaces.Water;
import bd.edu.bubt.cse.abstractClass.AirVehicle;

public class AWLVehicle extends AirVehicle implements Air, Water {

    public AWLVehicle() {
        super();
    }

    @Override
    public void fly() {
        System.out.println("AWL Vehicle is flying.");
    }

    @Override
    public void swim() {
        System.out.println("AWL Vehicle is swimming in water.");
    }
}
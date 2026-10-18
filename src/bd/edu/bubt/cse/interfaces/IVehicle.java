package bd.edu.bubt.cse.interfaces;

public interface IVehicle {
    public static final double PI = 3.1416;

    public abstract void move();
    public abstract void brake();
    public abstract double calcDistance();
}

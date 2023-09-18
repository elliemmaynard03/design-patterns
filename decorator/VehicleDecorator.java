/*
 * Written by Ellie Maynard
 */
package decorator;
import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle {
    /*
     * creates an arraylist lines
     */
    public VehicleDecorator(ArrayList<String> lines);

    /*
     * integrate decor decorates the car
     * @return decoratedVehicle
     */
    public void integrateDecor(ArrayList<String> decor) {
            return decoratedVehicle;
    }
    }


package factory;
/*
 * Written by Ellie Maynard
 */
public class Tricycle extends Bike {

    /*
     * Tricycle class initializes the variables given in the Bike class with set values that will be displayed each time Tricycle is called.
     */
    public Tricycle() {
        name = "Tricycle";
        price = 30.00;
        numWheels = 3;
        hasPedals = true;
        hasTrainingWheels = false;
    }

}

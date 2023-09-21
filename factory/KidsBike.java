package factory;
/*
 * Written by Ellie Maynard
 */
public class KidsBike extends Bike{
    /*
     * KidsBike class initializes the variables given in the Bike class with a set value that will be displayed each time KidsBike is called
     */
    public KidsBike() {
        name = "Kids Bike";
        price = 60.00;
        numWheels = 4;
        hasPedals = true;
        hasTrainingWheels = true;
    }
}

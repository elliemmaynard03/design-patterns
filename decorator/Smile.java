/*
 * Written by Ellie Maynard
 */
package decorator;


public class Smile {
    /*
     * reads the smile.txt file
     */
    public Smile(Vehicle vehicle) {
        this.vehicle = vehicle;
        super.FileReader.getLines("decorator/smile.txt");
    }
}


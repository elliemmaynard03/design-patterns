package factory;
/*
 * Written by Ellie Maynard
 */
public class Bike {
    /*
     * variables for each part of each bike, not set to anything but called and initialized in each specific bike class
     */
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /*
     * aseembleBike method takes an empty String result and calls each method for creating a bike and adds it to result
     * @return result
     */
    public String assembleBike() {
        String result = "'";
        result += ("Creating a " + name +"\n");
        result += createFrame();
        result += addWheels();
        result += addPedals();
        result += addTrainingWheels();
        result += getPrice();
        return result;
    }
    /*
     * gets bike name 
     * @return name
     */
    public String createFrame() {
        return ("- Assembling " + name + " frame\n");
    }
    /*
     * gets the number of bike wheels 
     * @return numWheels
     */
    public String addWheels() {
        return ("- Adding " + numWheels + " wheels\n");
    }
    /*
     * gets either true or false and adds pedals accordingly
     * @return ("Adding Pedals")
     * @return ("")
     */
    public String addPedals() {
        if (hasPedals == true){
        return ("- Adding Pedals\n");
        }
        else {
            return "";
        }
    }
    /*
     * gets either true or false and adds training wheels accordingly
     * @return ("Adding training wheels")
     * @return ("")
     */
    public String addTrainingWheels() {
        if (hasTrainingWheels == true) {
            return("- Adding training wheels\n");
        }
        else {
            return "";
        }
    }
    /*
     * gets bike price
     * @return price
     */
    public double getPrice() {
        return (- price);
    }
    
}

package factory;

public class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public String assembleBike() {
        String result = "'";
        result += ("Creating a " + name);
        result += createFrame();
        result += addWheels();
        result += addPedals();
        result += addTrainingWheels();
        result += getPrice();
        return result;
    }
    public String createFrame() {
        return ("Assembling " + name + " frame\n");
    }
    public String addWheels() {
        return ("Adding " + numWheels + " wheels\n");
    }
    public String addPedals() {
        if (hasPedals = true){
        return ("Adding Pedals\n");
        }
        else {
            return "";
        }
    }
    public String addTrainingWheels() {
        if (hasTrainingWheels = true) {
            return("adding training wheels\n");
        }
        else {
            return "";
        }
    }
    public double getPrice() {
        return (price);
    }
    
}

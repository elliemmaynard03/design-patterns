/*
 * Written by Ellie Maynard
 */
package decorator;

public class Paint extends VehicleDecorator {
    private String color;

    /*
     * paint takes in a vehicle and a color and produces a car of a new color
     * @param vehicle 
     * @param color
     */
    public Paint(Vehicle vehicle, String color) {
        super(vehicle);
        this.color = color;

        /*
         * gets the toString
         * changes the text color of the car from black to any color and back to black
         */
        String vehicleText = super.toString();
        String formattedText = "";

        switch (lowerColor) {
            case "black";
                formattedText = "\u001B[0m" + vehicleText + "\u001B[0m";
                break;
            case "red";
                formattedText = "\u001B[31m" + vehicleText + "\u001B[0m";
                break;
            case "green";
                formattedText = "\u001B[32m" + vehicleText + "\u001B[0m";
                break;
            case "yellow";
                formattedText = "\u001B[33m" + vehicleText + "\u001B[0m";
                break;
            case "blue";
                formattedText = "\u001B[34m" + vehicleText + "\u001B[0m";
                break;
            case "purple";
                formattedText = "\u001B[35m" + vehicleText + "\u001B[0m";
                break;
            case "cyan";
                formattedText = "\u001B[36m" + vehicleText + "\u001B[0m";
                break;
            default:
                formattedText = "\u001B[0m" + vehicleText + "\u001B[0m";
                break;
        }
        /*
         * prints the formatted text which is the colored text
         */
        System.out.println(formattedText);
    }
}

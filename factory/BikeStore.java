package factory;
/*
 * Written by Ellie Maynard
 */
public class BikeStore {
    public BikeStore() {}
    /*
     * Bike takes a bike and if type is equal to the case that the user chose from the Driver then bike becomes a new instance of the desired type
     * @param type
     * @return bike
     */
    public Bike createBike(String type) {
        Bike bike;

        if(type.equals("tricycle")) {
            bike = new Tricycle();
        } 
        else if(type.equals("strider")) {
            bike = new Strider();
        }
        else if(type.equals("kids bike")) {
            bike = new KidsBike();
        }
        else {
            return null;
        }

        bike.assembleBike();
        return bike;
    }
}

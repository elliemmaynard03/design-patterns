//Written by Ellie Maynard CSCE247
package strategy;

// using the defense interface to incorporate the play method to the sack that a player can use
public class SackBehavior implements DefenseBehavior{
    public String play() {
        return "Sacks the quarterback";
    }
}

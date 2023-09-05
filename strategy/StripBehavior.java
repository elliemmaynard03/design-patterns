//Written by Ellie Maynard CSCE247
package strategy;

// using the defense interface to incorporate the play method to the strip of the ball that a player can use
public class StripBehavior implements DefenseBehavior{
    public String play(){
        return "Strips a ball from the runner's hands";
    }
}

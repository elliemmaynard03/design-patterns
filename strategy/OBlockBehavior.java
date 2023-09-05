//Written by Ellie Maynard CSCE247
package strategy;

// using the offense interface to incorporate the play method to the blocks a player can use
public class OBlockBehavior implements OffenseBehavior{
    public String play() {
        return "Blocks defenders";
    }
}

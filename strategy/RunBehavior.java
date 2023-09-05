//Written by Ellie Maynard CSCE247
package strategy;
import java.util.Random;

// using the offense interface to incorporate the play method to the types of runs a player can do
public class RunBehavior implements OffenseBehavior{
    public String play() {
        Random random = new Random();
        int num = random.nextInt(4);

        if(num == 0){
            return "runs a drive";
        }
        else if(num == 1) {
            return "runs a draw";
        }
        else if(num == 2) {
            return "runs a pitch";
        }
        else{
            return "runs a reverse";
        }
    }
    
}
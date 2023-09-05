package strategy;
import java.util.Random;

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
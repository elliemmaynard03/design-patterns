package strategy;
import java.util.Random;

public class ReceiveBehavior implements OffenseBehavior{
    public String play(){
        Random random = new Random();
       int num = random.nextInt(5);

       if(num == 0){
           return "runs a slant route";
       }
       else if(num == 1) {
           return "runs an out route";
       }
       else if(num == 2) {
           return "runs a seem route";
       }
       else if(num == 3) {
           return "runs a screen pass";
       }
       else{
           return "runs a hail mary";
       }
   }
}

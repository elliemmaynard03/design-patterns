//Written by Ellie Maynard CSCE247
package strategy;
import java.util.Random;

// using the offense interface to incorporate the play method to the types of runs a player can use
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

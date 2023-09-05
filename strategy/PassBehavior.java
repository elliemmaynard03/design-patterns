//Written by Ellie Maynard CSCE 247
package strategy;

import java.util.Random;

// using the offense interface to incorporate the play method to the types of throws a player can use
public class PassBehavior implements OffenseBehavior{
    public String play(){
         Random random = new Random();
        int num = random.nextInt(5);

        if(num == 0){
            return "throws a slant route";
        }
        else if(num == 1) {
            return "throws an out route";
        }
        else if(num == 2) {
            return "throws a seem route";
        }
        else if(num == 3) {
            return "throws a screen pass";
        }
        else{
            return "throws a hail mary";
        }
    }
    }
    
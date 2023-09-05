package strategy;

import java.util.Random;

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
    
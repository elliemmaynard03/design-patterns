//Written by Ellie Maynard CSCE247
package strategy;

import java.util.Random;

// using the defense interface to incorporate the play method to the types of blocks a player can use
public class BlockBehavior implements DefenseBehavior{
    public String play(){
        Random random = new Random();
        int num = random.nextInt(4);

        if(num == 0){
            return "blocks a kick";
        }
        else if(num == 1) {
            return "blocks a punt";
        }
        else if(num == 2) {
            return "blocks a pass";
        }
        else{
            return "blocks a catch";
        }
    }
}

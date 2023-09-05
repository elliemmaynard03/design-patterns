package strategy;

import java.util.Random;

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

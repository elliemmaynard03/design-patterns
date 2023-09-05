//Written by Ellie Maynard CSCE247
package strategy;

//uses the information for a quarterback and tells offense or defense as well as setting the behavior
public class QuarterBack extends Player{
     //gets the name and whether or not offense or defense, gets a new behavior
        public QuarterBack(String firstName, String lastName, boolean isOffense) {
            super(firstName, lastName, new BlockBehavior(), new PassBehavior());
        }
        //sets the new offense behavior
        public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
            super.setOffenseBehavior(offenseBehavior);
        }
        //sets the new defense behavior
        public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
            super.setDefenseBehavior(defenseBehavior);
        }
    }


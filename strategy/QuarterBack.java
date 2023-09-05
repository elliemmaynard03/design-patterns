package strategy;

public class QuarterBack extends Player{
        public QuarterBack(String firstName, String lastName, boolean isOffense) {
            super(firstName, lastName, new BlockBehavior(), new PassBehavior());
        }
        public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
            super.setOffenseBehavior(offenseBehavior);
        }
        public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
            super.setDefenseBehavior(defenseBehavior);
        }
    }


package strategy;

public class Lineman extends Player{
        public Lineman(String firstName, String lastName, boolean isOffense) {
            super(firstName, lastName, new BlockBehavior(), new ReceiveBehavior());
        }
        public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
            super.setOffenseBehavior(offenseBehavior);
        }
        public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
            super.setDefenseBehavior(defenseBehavior);
        }
    }


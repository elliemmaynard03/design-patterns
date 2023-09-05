package strategy;


public class Player {

    protected OffenseBehavior offenseBehavior;
    protected DefenseBehavior defenseBehavior;  
    private String firstName;
    private String lastName;
    
    

    public Player(String firstName, String lastName, DefenseBehavior defense, OffenseBehavior offense) {
        this.defenseBehavior = defense;
        this.offenseBehavior = offense;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public OffenseBehavior getOffenseBehavior() {
        return offenseBehavior;
    }
    
    public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
        this.offenseBehavior = offenseBehavior;
    }

    public DefenseBehavior getDefenseBehavior() {
        return defenseBehavior;
    }

    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        this.defenseBehavior = defenseBehavior;
    }

    public String play() {
        if(isOnOffense()) {
            return offenseBehavior.play();
        }
        else {
            return defenseBehavior.play();
        }
    }

    public boolean isOnOffense() {
    return true;
    }

    public void turnover() {

    }

    public String toString() {
        return firstName + " " + lastName;
    }

}
   
 

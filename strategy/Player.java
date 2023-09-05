//Written by Ellie Maynard CSCE247
package strategy;

//player class decides whether or not we are playing offense or defense and what the players names are
public class Player {

    protected OffenseBehavior offenseBehavior;
    protected DefenseBehavior defenseBehavior;  
    private String firstName;
    private String lastName;
    
    
// calls each method to retrieve the name and behavior information
    public Player(String firstName, String lastName, DefenseBehavior defense, OffenseBehavior offense) {
        this.defenseBehavior = defense;
        this.offenseBehavior = offense;
        this.firstName = firstName;
        this.lastName = lastName;
    }
//gets the offense behavior and returns it
    public OffenseBehavior getOffenseBehavior() {
        return offenseBehavior;
    }
    //sets the offense behavior to the chosen behavior
    public void setOffenseBehavior(OffenseBehavior offenseBehavior) {
        this.offenseBehavior = offenseBehavior;
    }
//gets the defense behavior and returns it
    public DefenseBehavior getDefenseBehavior() {
        return defenseBehavior;
    }

    //sets the defense behavior to the chosen behavior
    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        this.defenseBehavior = defenseBehavior;
    }

    //calls the play method depending on offense or defense
    public String play() {
        if(isOnOffense()) {
            return offenseBehavior.play();
        }
        else {
            return defenseBehavior.play();
        }
    }
//this boolean is for deciding offense or defense
    public boolean isOnOffense() {
    return true;
    }

    //turnover to either offense or defense
    public void turnover() {
    
    }

    //toString method gets the names of the players
    public String toString() {
        return firstName + " " + lastName;
    }

}
   
 

package observer;
/*
 * @author Ellie Maynard
 * displays the score of strokes and par for each individual hole 
 * implements the observer interface to update the score changes
 */
public class HoleScoreDisplay implements Observer {

    protected Subject golfer;
    protected int strokes;
    protected int par;

    /*
     * displays the score of the current hole
     * @param golfer
     */
    public HoleScoreDisplay (Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /*
     * updates the strokes and par scores
     * @param strokes
     * @param par
     */
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
    }

    /*
     * creates a String of the current hole stats
     * @return strokes
     * @return par
     */
    public String toString() {
        return "Current Hole Stats: Strokes (" + strokes + ") Par ("+ par+")";
    }

}

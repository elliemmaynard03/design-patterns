package observer;
/*
 * @author Ellie Maynard
 * this class displays the stats of the score for the entire round
 * it uses the observer interface to update the scores
 */
public class RoundScoreDisplay implements Observer{

    protected Subject golfer;
    protected int strokesTotal;
    protected int parTotal;

    /*
     * gets the golfer name and registers an observer
     * @param golfer
     */
    public RoundScoreDisplay (Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /*
     * updates the strokes and par totals
     * @param stroke
     * @param par
     */
    public void update(int strokes, int par) {
        strokesTotal += strokes;
        parTotal += par;
    }

    /*
     * creates a string for displaying the overall stats
     * @return strokesTotal
     * @return parTotal
     */
    public String toString() {
        return "Overall stats: Strokes ("+strokesTotal +") Par ("+parTotal+")";
    }
}

package observer;
/*
 * @author Ellie Maynard
 * this interface updates and displays the score
 */

public interface Observer {
    /*
     * @param strokes
     * @param par
     * updates the observes stats
     */
    public void update(int strokes, int par);
    /*
     * creates a string of the stats for the observer
     */
    public String toString();
}

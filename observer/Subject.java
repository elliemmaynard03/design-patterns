package observer;
/*
 * @author Ellie Maynard
 * the subject interface defines what the observer does for the subject
 * The observer can be registered, removed, and notified
 */

public interface Subject {
   
    /*
     * registers the observer for the subject
     * @param observer
     */
    public void registerObserver(Observer observer);
    /*
     * removes the observer for the subject
     * @param observer
     */
    public void removeObserver(Observer observer);
    /*
     * notifies the observer about updates
     * @param strokes 
     * @param par
     */
    public void notifyObserver(int strokes, int par);
}

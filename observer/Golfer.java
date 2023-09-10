/**
 * The subject of the golf simulator
 * @author Ellie Maynard
 */
package observer;

import java.util.ArrayList;
import java.util.List;

public class Golfer implements Subject {
    protected List<Observer> observers;
    protected String name;

    /**
     * creates a string representation of the golfer's name
     * a new arraylist is created for the obsservers
     * @param name
     */
    public Golfer(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    /*
     * calls the add method and adds an observer
     * @param observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /*
     * calls the remove method and removes the observer
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /*
     * calls the update method and updates the strokes and par
     * @param strokes
     * @param par
     */
    public void notifyObserver(int strokes, int par) {
        for(Observer observer : observers) {
            observer.update(strokes, par);
        }
    }
    /*
     * enters the golfer's score and notifies the observer
     * @param strokes
     * @param par
     */
    public void enterScore(int strokes, int par) {
        notifyObserver(strokes, par);
    }

    /*
     * @returns name of golfer
     */
    public String getName() {
        return name;
    }

}



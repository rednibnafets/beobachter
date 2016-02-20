/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern02observer;

import java.util.ArrayList;

/**
 *
 * @author s
 * original code see
 * http://www.vincehuston.org/dp/ObserverDemosJava
 * accessed on 2016-02-20
 */
public class Subject {
    // the "independent" abs

    // use ArrayList instead of an array
    private ArrayList< Observer> observers;  // coupled to the (abstract) base class
    private int state;

    // add a default ctor
    public Subject() {
        observers = new ArrayList<>();
        state = 0;
    }
    
    // coupled
    public void attach(Observer o) {
        observers.add(o);
    } 

    public int getState() {
        return state;
    }

    public void setState(int in) {
        state = in;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}

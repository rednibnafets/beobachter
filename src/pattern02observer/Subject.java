/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern02observer;

import java.util.ArrayList;

/**
 *
 * @author stefan
 * original code see
 * http://www.vincehuston.org/dp/ObserverDemosJava
 * accessed on 2016-02-20
 */
public class Subject {
    // 1. The "independent" abs

    // use ArrayList
    private ArrayList< Observer> observers;  // 3. Coupled to base class
    // not needed when we use ArrayList
    //private int totalObs = 0 
    private int state;

    // add default ctor
    public Subject() {
        observers = new ArrayList<>();
        state = 0;
    }

    // modify: use observers ArrayList
//    public void attach(Observer o) {
//        observers[totalObs++] = o;
//    } // 3. Coupled
    public void attach(Observer o) {
        observers.add(o);
    } // 3. Coupled

    public int getState() {
        return state;
    }

    public void setState(int in) {
        state = in;
        notifyObservers();
    }

    private void notifyObservers() {
//        for (int i = 0; i < totalObs; i++) {
//            observers[i].update();         // 3. Coupled to base class
//        }
// use a for each loop
        for (Observer o : observers) {
            o.update();
        }
    }
}

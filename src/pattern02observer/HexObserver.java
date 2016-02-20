/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern02observer;

/**
 *
 * @author stefan
 */
public class HexObserver extends Observer {

    public HexObserver(Subject s) {    //    hierarchy
        subj = s;
        subj.attach(this);
    } // 4. Observers register themselves

    public void update() {
        System.out.print("  " + Integer.toHexString(subj.getState()));
    }
}

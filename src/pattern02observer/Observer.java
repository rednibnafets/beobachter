/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern02observer;

/**
 *
 * @author stefan
 * original code see
 * http://www.vincehuston.org/dp/ObserverDemosJava
 * accessed on 2016-02-20
 */
abstract class Observer {               // 2. Root of the "dependent" hierarchy

    protected Subject subj;

    public abstract void update();
}

package pattern02observer;

/**
 *
 * @author s
 * original code see
 * http://www.vincehuston.org/dp/ObserverDemosJava
 * accessed on 2016-02-20
 */

// Root of the "dependent" hierarchy

abstract class Observer {         

    protected Subject subject;

    public abstract void update();
}

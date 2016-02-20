package pattern02observer;

/**
 *
 * @author s original code see
 * http://www.vincehuston.org/dp/ObserverDemosJava accessed on 2016-02-20
 */
public class OctObserver extends Observer {
    
    // Observers register themselves
    public OctObserver(Subject s) {
        this.subject = s;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.print("  " + Integer.toOctalString(this.subject.getState()));
    }
}

package pattern02observer;
/**
 *
 * @author s
 * original code see
 * http://www.vincehuston.org/dp/ObserverDemosJava
 * accessed on 2016-02-20
 */
public class HexObserver extends Observer {
    
    // Observers register themselves
    public HexObserver(Subject s) {
        this.subject = s;
        this.subject.attach(this);
    } 

    @Override
    public void update() {
        System.out.print("  " + Integer.toHexString(this.subject.getState()));
    }
}

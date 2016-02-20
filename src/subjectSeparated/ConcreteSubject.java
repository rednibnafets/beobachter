//
// modified observer: use interfaces
//
package subjectSeparated;

import java.util.ArrayList;
/**
 *
 * @author stefan
 */
public class ConcreteSubject implements SubjectI {

    protected ArrayList< ConcreteObserver> COList;

    public ConcreteSubject()
    {
        this.COList = new ArrayList< ConcreteObserver>() ;
    }
    //@Override
    public void subscribe(ConcreteObserver co) {
        this.COList.add(co);
    }

    //@Override
    public void unsubscribe(ConcreteObserver co) {

    }

    //@Override
    public void notifyObservers() {
        for (ConcreteObserver co : COList)
        {
            co.updateConcreteObserver();
        }

    }

}

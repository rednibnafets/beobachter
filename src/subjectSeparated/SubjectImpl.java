//
// modified observer: use interfaces
//
package subjectSeparated;

import java.util.ArrayList;
/**
 *
 * @author stefan
 */
public class SubjectImpl implements SubjectI {

    protected ArrayList< ObserverImpl > OImplList;

    public SubjectImpl()
    {
        this.OImplList = new ArrayList<>() ;
        //System.out.println("SubjectImpl: instantiated");               
    }
    
    @Override
    public void addObserver(ObserverImpl oi) {
        this.OImplList.add(oi);
        //System.out.println("SubjectImpl: addObserver(ObserverImpl oi)");      
    }

    @Override
    public void removeObserver(ObserverImpl oi) {

    }

    @Override
    public void notifyObservers() {
        // System.out.println("SubjectImpl: notifyObservers() : before the loop");              
        for (ObserverImpl oi : OImplList)
        {
            oi.updateConcreteObserver();
        }

    }

}

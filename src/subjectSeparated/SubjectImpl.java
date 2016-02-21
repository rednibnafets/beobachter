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

    protected ArrayList< ObserverI > OIList;

    public SubjectImpl()
    {
        this.OIList = new ArrayList<>() ;
        //System.out.println("SubjectImpl: instantiated");               
    }
    
    @Override
    public void addObserver(ObserverI oi) {
        this.OIList.add(oi);
        //System.out.println("SubjectImpl: addObserver(ObserverImpl oi)");      
    }

    @Override
    public void removeObserver(ObserverI oi) {
        int i = this.OIList.indexOf(oi) ;
        if (i >= 0)
            this.OIList.remove(i);        
    }

    @Override
    public void notifyObservers() {
        // System.out.println("SubjectImpl: notifyObservers() : before the loop");              
        for (ObserverI oi : OIList)
        {
            oi.updateConcreteObserver();
        }

    }

}

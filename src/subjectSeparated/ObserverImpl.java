//
// modified observer: use interfaces
//
package subjectSeparated;
/**
 *
 * @author stefan
 */
public class ObserverImpl implements ObserverI {

    protected String observername_ ; 

    public ObserverImpl(String name, SubjectI si)
    {
        this.observername_ = name ;
        si.addObserver(this);          // self-registering
    }
    
    @Override
    public void updateConcreteObserver() 
    {
        System.out.println( this.observername_ + " updated!") ;
    }    
    
}

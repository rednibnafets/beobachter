//
// modified observer: use interfaces
//
package subjectSeparated;
/**
 *
 * @author stefan
 */
public class ConcreteObserver implements ObserverI {

    //?
    protected String coname_ ; 
    //?
    public ConcreteObserver(String name)
    {
        this.coname_ = name ;
    }
    
    @Override
    public void updateConcreteObserver() 
    {
        System.out.println( this.coname_ + " updated!") ;
    }    
    
}

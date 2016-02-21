package subjectSeparated;
/**
 *
 * @author stefan
 */
public class Agent {
    
    private String name_ ;
    boolean onDuty_ ;
    private SubjectImpl si_ ;
    
    public Agent(String name)
    {
        this.name_ = name ;
        this.onDuty_ = false ;
        this.si_ = new SubjectImpl() ;
        //System.out.println("agent: instantiated");
    }
    
    public boolean receiveOrder()
    {
        this.onDuty_ = true ;
        si_.notifyObservers();
        //System.out.println("agent: receiveOrder()");        
        return onDuty_ ;
    }
    
    // si_ "exposed" (see client / testing code)
    public SubjectImpl missionSupport()
    {
        //System.out.println("agent: missionSupport()");               
        return si_ ;
    }
}

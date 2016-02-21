// Purpose.  Observer design pattern
//
// 1. Model the "independent" functionality with a "subject" abstraction
// 2. Model the "dependent" functionality with "observer" hierarchy
// 3. The Subject is coupled only to the Observer base class
// 4. Observers register themselves with the Subject
// 5. The Subject broadcasts events to all registered Observers
// 6. Observers "pull" the information they need from the Subject
// 7. Client configures the number and type of Observers
//
// http://www.vincehuston.org/dp/ObserverDemosJava
// accessed on 2016-02-20
package pattern02observer;

import java.util.Random;
import subjectSeparated.Agent;
import subjectSeparated.ObserverImpl;
import subjectSeparated.SubjectImpl;

/**
 *
 * @author s
 * original code see
 * http://www.vincehuston.org/dp/ObserverDemosJava
 * accessed on 2016-02-20
 */
public class Pattern02observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //testVersion1() ;
        
        testVersion2();
    }

    public static int testVersion2()
    {
        
        ObserverImpl missionSupport1 = new ObserverImpl("Ms Moneypenny");
        ObserverImpl missionSupport2 = new ObserverImpl("Q");
        ObserverImpl missionSupport3 = new ObserverImpl("M");
        
        Agent agent = new Agent("001") ;
        
        agent.missionSupport().addObserver(missionSupport1); 
        agent.missionSupport().addObserver(missionSupport2);        
        agent.receiveOrder() ;
        
        System.out.println("--------------------------------------------------");
        
        Agent agent2 = new Agent("002") ;
        agent2.missionSupport().addObserver(missionSupport3);
        agent2.receiveOrder() ;
        
        System.out.println("--------------------------------------------------");        
        
        agent.missionSupport().removeObserver(missionSupport2);        
        agent.receiveOrder();

        return 0;
    }
    
    public static int testVersion1()
    {
         Subject subject = new Subject();
        
        // 7. Client configures the number and type of Observers
        new HexObserver(subject);
        new OctObserver(subject);
        new BinObserver(subject);
        
        for (int i = 0 ; i < 100 ; i++)
        {
            Random r = new Random();
            subject.setState(Math.abs(r.nextInt())) ;  // Math.abs: positive numbers only
            System.out.println("\n----------------------------------------------");
            System.out.println("  getState -> " + subject.getState() ) ;
            System.out.println("\n----------------------------------------------");            
        }   
    
        return 0;
    
    }

}

//
// modified observer: use interfaces
//
package subjectSeparated;
/**
 *
 * @author stefan
 */
public interface SubjectI {
    void addObserver(ObserverImpl oi);
    void removeObserver(ObserverImpl oi);
    void notifyObservers() ;
    
}

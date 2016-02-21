//
// modified observer: use interfaces
//
package subjectSeparated;
/**
 *
 * @author stefan
 */
public interface SubjectI {
    void addObserver(ObserverI oi);
    void removeObserver(ObserverI oi);
    void notifyObservers() ;
    
}

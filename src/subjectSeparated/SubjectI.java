package subjectSeparated;
/**
 *
 * @author stefan
 */
public interface SubjectI {
    void subscribe(ConcreteObserver co);
    void unsubscribe(ConcreteObserver co);
    void notifyObservers() ;
    
}

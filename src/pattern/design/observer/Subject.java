package pattern.design.observer;


/**
 * Created by Alex on 2017/5/26.
 */
public interface Subject {
    //methods to register and unregister observers
    public void register(Observer obj);

    public void unregister(Observer obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(Observer obj);
}

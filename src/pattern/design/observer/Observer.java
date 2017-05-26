package pattern.design.observer;

/**
 * Created by Alex on 2017/5/26.
 */
public interface Observer {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observer
    public void setSubject(Subject sub);
}

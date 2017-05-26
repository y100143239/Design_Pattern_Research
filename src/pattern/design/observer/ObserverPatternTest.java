package pattern.design.observer;

/**
 * Created by Alex on 2017/5/26.
 */
public class ObserverPatternTest {

    public static void main(String[] args) {
        //create subject
        MyTopic topic = new MyTopic();

        //create observer
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);


        //attach observers to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //check if any update is available
        obj1.update();

        obj2.update();
        //now send message to subject
        topic.postMessage("New Message");
    }

}

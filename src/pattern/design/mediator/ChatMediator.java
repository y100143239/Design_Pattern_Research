package pattern.design.mediator;

/**
 * Created by Alex on 2017/5/23.
 */
public interface ChatMediator {

    public void sendMessage(String msg, User use);

    void addUser(User user);
}

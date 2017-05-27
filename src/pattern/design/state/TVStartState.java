package pattern.design.state;

/**
 * Created by Alex on 2017/5/27.
 */
public class TVStartState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}

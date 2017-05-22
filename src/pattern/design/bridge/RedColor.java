package pattern.design.bridge;

/**
 * Created by Alex on 2017/5/23.
 */
public class RedColor implements Color {


    @Override
    public void applyColor() {
        System.out.println("red.");
    }
}

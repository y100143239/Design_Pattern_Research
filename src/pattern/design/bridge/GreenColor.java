package pattern.design.bridge;

/**
 * Created by Alex on 2017/5/23.
 */
public class GreenColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("green.");
    }
}

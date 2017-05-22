package pattern.design.decorator;

/**
 * Created by Alex on 2017/5/23.
 */
public class BasicCar implements Car {


    @Override
    public void assemble() {
        System.out.println("Basic Car.");
    }
}

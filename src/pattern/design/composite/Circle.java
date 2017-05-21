package pattern.design.composite;

/**
 * Created by Alex on 2017/5/22.
 */
public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color " + fillColor);
    }
}

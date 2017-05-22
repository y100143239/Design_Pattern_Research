package pattern.design.flyweight;

import java.awt.*;

/**
 * Created by Alex on 2017/5/22.
 */
public class Oval implements Shape{

    private boolean fill;

    public Oval(boolean f){
        this.fill = f;
        System.out.println("Creating oval object with fill=" + f);
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if (fill) {
            circle.fillOval(x, y, width, height);
        }
    }
}

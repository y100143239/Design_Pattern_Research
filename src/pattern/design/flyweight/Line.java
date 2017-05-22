package pattern.design.flyweight;

import java.awt.*;

/**
 * Created by Alex on 2017/5/22.
 */
public class Line implements Shape {

    public Line(){
        System.out.println("Creating line object");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }
}

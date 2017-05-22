package pattern.design.flyweight;

import java.awt.*;

/**
 * Created by Alex on 2017/5/22.
 */
public interface Shape {
    public void draw(Graphics g, int x, int y, int width, int height, Color color);

}

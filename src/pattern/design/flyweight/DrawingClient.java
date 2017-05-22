package pattern.design.flyweight;

import pattern.design.flyweight.ShapeFactory.ShapeType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 2017/5/22.
 */
public class DrawingClient extends JFrame {

    private static final long serialVersionUID = 2915904602674706462L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeType shapes[] = {
            ShapeType.LINE, ShapeType.OVAL_FILL, ShapeType.OVAL_NONFILL
    };

    private static final Color colors[] = {
        Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE
    };

    public DrawingClient(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 200);
        setVisible(true);


        startButton.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              Graphics g = panel.getGraphics();
                                              for(int i = 0; i < 20; ++i) {
                                                  Shape shape =
                                                          ShapeFactory.getShape(getRandomShape());
                                                  shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(),
                                                          getRandomHeight(), getRandomColor());

                                              }
                                          }
                                      }
        );

    }


    private ShapeType getRandomShape(){
        return shapes[(int) (Math.random() * shapes.length)];

    }

    private int getRandomX(){
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY(){
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth(){
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight(){
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor(){
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        DrawingClient drawing = new DrawingClient(500, 600);
    }


}

package pattern.design.template;

/**
 * Created by Alex on 2017/5/23.
 */
public class WoodenHouse extends HouseTemplate {




    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}

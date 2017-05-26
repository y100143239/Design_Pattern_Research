package pattern.design.template;

/**
 * Created by Alex on 2017/5/23.
 */
public class HousingClient {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("******************");

        houseType = new GlassHouse();
        houseType.buildHouse();


    }

}

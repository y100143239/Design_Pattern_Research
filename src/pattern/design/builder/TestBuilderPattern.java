package pattern.design.pattern.design.builder;

/**
 * Created by Alex on 2017/5/21.
 */
public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

    }

}

package pattern.design.factory;

/**
 * Created by Alex on 2017/5/21.
 */
public class TestFactory {
    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("server", "2 GB", "500 GB", "2.4 GHz");

        Computer server = ComputerFactory.getComputer("pc", "16 GB", "1 TB", "2.9 GHz");

        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);


    }

}

package pattern.design.singleton;

/**
 * Created by Alex on 2017/5/21.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance.");
        }
    }

    public StaticBlockSingleton getInstance(){
        return instance;
    }
}

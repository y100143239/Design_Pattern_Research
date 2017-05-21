package pattern.design.singleton;

/**
 * Created by Alex on 2017/5/21.
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance =
            new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

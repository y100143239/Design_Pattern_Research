package pattern.design.singleton;

/**
 * Created by Alex on 2017/5/21.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;

    }
}

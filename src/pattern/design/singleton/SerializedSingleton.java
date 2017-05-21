package pattern.design.singleton;

import java.io.Serializable;

/**
 * Created by Alex on 2017/5/21.
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = 2114399060656185918L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance =
                new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

}

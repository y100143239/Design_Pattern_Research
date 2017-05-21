package pattern.design.adapter;

/**
 * Created by Alex on 2017/5/22.
 */
public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}

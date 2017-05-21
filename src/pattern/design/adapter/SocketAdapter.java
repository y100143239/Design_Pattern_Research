package pattern.design.adapter;

/**
 * Created by Alex on 2017/5/22.
 */
public interface SocketAdapter {
    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}

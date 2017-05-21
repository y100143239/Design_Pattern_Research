package pattern.design.adapter;

/**
 * Created by Alex on 2017/5/22.
 */
public class SocketObjectAdapterImpl implements SocketAdapter {

    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getVolt();
        return convetVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVolt();
        return convetVolt(v, 40);
    }

    private Volt convetVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}

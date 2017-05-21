package pattern.design.adapter;

/**
 * Created by Alex on 2017/5/22.
 */
public class Volt {
    private int volts;

    public Volt(int v) {
        this.volts = v;
    }

    public int getVolts(){
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }


}

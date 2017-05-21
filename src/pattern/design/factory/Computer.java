package pattern.design.factory;

/**
 * Created by Alex on 2017/5/21.
 */
public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public  String toString(){
        return "RAM= " + this.getRAM() +", HDD="+this.getHDD()+", CPU="+this.getCPU();

    }

}

package pattern.design.chainofresponsibilty;

/**
 * Created by Alex on 2017/5/24.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}

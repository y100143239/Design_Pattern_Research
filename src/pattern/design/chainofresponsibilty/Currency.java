package pattern.design.chainofresponsibilty;

/**
 * Created by Alex on 2017/5/24.
 */
public class Currency {

    private int amount;

    public Currency(int amt) {
        this.amount = amt;
    }

    public int getAmount(){
        return this.amount;
    }


}

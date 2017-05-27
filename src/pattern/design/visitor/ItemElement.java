package pattern.design.visitor;

/**
 * Created by Alex on 2017/5/27.
 */
public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}

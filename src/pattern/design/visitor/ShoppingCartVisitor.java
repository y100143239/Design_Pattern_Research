package pattern.design.visitor;

/**
 * Created by Alex on 2017/5/27.
 */
public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}

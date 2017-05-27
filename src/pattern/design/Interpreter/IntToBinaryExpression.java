package pattern.design.Interpreter;

/**
 * Created by Alex on 2017/5/27.
 */
public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}

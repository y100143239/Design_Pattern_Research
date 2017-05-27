package pattern.design.Interpreter;

/**
 * Created by Alex on 2017/5/27.
 */
public class IntToHexExpression implements Expression {

    private int i;

    public IntToHexExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}

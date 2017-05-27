package pattern.design.Interpreter;

/**
 * Created by Alex on 2017/5/27.
 */
public interface Expression {
    String interpret(InterpreterContext ic);
}

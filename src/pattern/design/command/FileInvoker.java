package pattern.design.command;

/**
 * Created by Alex on 2017/5/27.
 */
public class FileInvoker {

    public Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
    }
}

package pattern.design.command;

/**
 * Created by Alex on 2017/5/27.
 */
public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}

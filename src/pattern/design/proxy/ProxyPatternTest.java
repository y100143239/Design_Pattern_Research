package pattern.design.proxy;

/**
 * Created by Alex on 2017/5/22.
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");

        try{
            executor.runCommand("notepad");
            executor.runCommand("rm -rf abc.pdf");

        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }

}

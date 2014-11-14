package test;

import proxy.CommandExecutor;
import proxy.CommandExecutorProxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Timon", "password");

        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}

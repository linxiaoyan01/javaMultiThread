package singlethreadexecution;

/**
 * @author Yuery
 * @date 2021/3/23/0023 - 21:25
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Testing Gate, hit CTRL+C to exit.");
        Gate gate = new Gate();
        new UserThread(gate,"Alice","Alaska").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Charis","Canada").start();
    }
}

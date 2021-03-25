package singlethreadexecution;

/**
 * @author Yuery
 * @date 2021/3/23/0023 - 21:25
 */
public class UserThread extends Thread {
    private final Gate gate;
    private final String name;
    private final String address;
    public UserThread(Gate gate,String name,String address) {
        this.gate = gate;
        this.name = name;
        this.address = address;
    }
    @Override
    public void run(){
        System.out.println(name + " Begin");
        while (true) {
            gate.pass(name, address);
        }
    }
}

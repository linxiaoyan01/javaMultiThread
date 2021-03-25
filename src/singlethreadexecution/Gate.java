package singlethreadexecution;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Yuery
 * @date 2021/3/23/0023 - 21:25
 */
public class Gate {
    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";
    private final Lock lock = new ReentrantLock();
    public synchronized void pass(String name, String address){
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }
    @Override
    public synchronized String toString(){
        lock.lock();
        try{
            return "No."+counter+":"+name+","+address;
        }finally {
            lock.unlock();
        }

    }
    private void check(){
        if(name.charAt(0) != address.charAt(0)){
            System.out.println("****Broken****"+toString());
        }
    }
}

package semahore;
import java.util.Random;
import java.util.concurrent.Semaphore;
class Log{
    public static void printlin(String s){
        System.out.println(Thread.currentThread().getName() + ": "+s);
    }
}
class BoundedResource{
    private final Semaphore semaphore;
    private int permits;
    private final static Random RANDOM = new Random(314159);
    public BoundedResource(int permits){
        this.semaphore = new Semaphore(permits);
        this.permits = permits;
    }
    public void use() throws InterruptedException{
        semaphore.acquire();
        try{
            doUse();
        }finally {
            semaphore.release();
        }
    }
    protected void doUse() throws InterruptedException{
        Log.printlin("BEGIN: used = "+(permits = semaphore.availablePermits()));
        Thread.sleep(RANDOM.nextInt(500));
        Log.printlin("END: used = "+(permits = semaphore.availablePermits()));
    }

}
class UserThread extends Thread{
    private final static Random RANDOM = new Random(26535);
    private final BoundedResource resource;

    public UserThread(BoundedResource resource) {
        this.resource = resource;
    }
    @Override
    public void run(){
        try{
            while(true){
                resource.use();
                Thread.sleep(RANDOM.nextInt(3000));
            }
        }catch (InterruptedException e){
        }
    }
}
/**
 * @author Yuery
 */
public class Main {
    public static void main(String[] args){
        int n = 10;
        BoundedResource resource = new BoundedResource(3);
        for(int i = 0; i < n; i++){
            new UserThread(resource).start();
        }
    }
}

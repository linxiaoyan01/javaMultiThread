package guardedsuspension;
import java.util.Random;
/**
 * @author Yuery
 * @date 2021/3/25/0025 - 12:37
 */
public class ClientThread extends Thread{
    private final Random random;
    private final RequestQueue requestQueue;
    public ClientThread(RequestQueue requestQueue, String name, long seed){
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }
    @Override
    public void run(){
        for(int i = 0; i < 10000; i++){
            Request request = new Request("No."+i);
            System.out.println(Thread.currentThread().getName()+" requests "+ request);//"string + 对象"会自动将调用toString()
            requestQueue.putRequest(request);
            try{
                Thread.sleep(random.nextInt(1000));
            }catch(InterruptedException e){
            }

        }
    }
}

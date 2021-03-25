package guardedsuspension;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * @author Yuery
 * @date 2021/3/25/0025 - 13:17
 */
public class RequestQueueLinkedBlockingQueue {
    private BlockingQueue<Request> queue = new LinkedBlockingQueue<Request>();
    public Request getRequest(){
        Request req = null;
        try{
            req = queue.take();
        }catch(InterruptedException e){

        }
        return req;
    }
    public void putRequest(Request request){
        try{
            queue.put(request);
        }catch (InterruptedException e){

        }
    }
}

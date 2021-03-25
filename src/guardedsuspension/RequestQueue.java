package guardedsuspension;
import java.util.Queue;
import java.util.LinkedList;
/**
 * @author Yuery
 * @date 2021/3/25/0025 - 12:33
 */
public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();
    /**getRequest方法对应guardedMethod*/
    public synchronized Request getRequest(){
        while(queue.peek() == null){
            try{
                /**不会浪费虚拟机的时间*/
                wait();
                /**等待端的线程还在持续运行，只是尽可能地将优先级让给别人，会浪费虚拟机的时间
                 * while(!ready){
                 *      Thread.yield();
                 * }
                 * Thread.yield并不会释放锁，所以这段代码不可以写在synchronized中，另外，ready字段必须声明为volatile
                 */
            }catch(InterruptedException e){
            }
        }
        return queue.remove();
    }
    /**putRequest方法对应stateChangingMethod*/
    public synchronized void putRequest(Request request){
        queue.offer(request);
        notifyAll();
    }
}

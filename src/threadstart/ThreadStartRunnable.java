package threadstart;
import java.lang.Runnable;
/**
 * @author Yuery
 * @date 2021/3/23/0023 - 13:39
 */
public class ThreadStartRunnable implements Runnable{
    private final String message;
    public ThreadStartRunnable(String message){
        this.message = message;
    }
    @Override
    public void run(){
        int n = 100;
        for(int i = 0; i < n ;i++){
            System.out.println(message);
        }
    }
    public static void main(String[] args){
        new Thread(new ThreadStartRunnable("Good")).start();
        new Thread(new ThreadStartRunnable("nice")).start();
    }
}

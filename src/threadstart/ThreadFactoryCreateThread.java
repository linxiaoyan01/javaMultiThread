package threadstart;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/**
 * @author Yuery
 * @date 2021/3/23/0023 - 13:45
 */
public class ThreadFactoryCreateThread {
    public static void main(String[] args){
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(new ThreadStart1("Nice")).start();
        int n = 100;
        for(int i = 0; i < n; i++){
            System.out.println("Good");
        }
    }
}

package testarraylist;

import java.util.List;
/**
 * @author Yuery
 * @date 2021/3/25/0025 - 9:52
 */
public class ReaderThread extends Thread{
    private final List<Integer> list;
    public ReaderThread(List<Integer> list){
        super("ReaderThread");
        this.list = list;
    }
    @Override
    public void run(){
        while(true){
            /**读线程是隐式调用迭代器，故要修改代码为，使用sychronized同步代码块*/
            synchronized (this){
                for(int n : list){
                    System.out.println(n);
                }
            }
        }
    }
}

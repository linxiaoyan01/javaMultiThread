package testarraylist;

import java.util.List;

/**
 * @author Yuery
 * @date 2021/3/25/0025 - 9:52
 */
public class WriterThread extends Thread{
    private final List<Integer> list;


    public WriterThread(List<Integer> list) {
        super("WriterThread");
        this.list = list;
    }
    @Override
    public void run(){

        for(int i = 0; true; i++){
            list.add(i);
            list.remove(0);
        }
    }
}

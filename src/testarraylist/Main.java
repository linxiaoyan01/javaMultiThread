package testarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * @author Yuery
 * @date 2021/3/25/0025 - 9:51
 */
public class Main {

    public static void main(String[] args){
        /**线程不安全*/
        final List<Integer> list1 = new ArrayList<>();
        /**线程安全，写操作之前被复制一份*/
        final List<Integer> list2 = new CopyOnWriteArrayList<>();
        /**线程不安全，书本说是线程安全，测试发现并不是*/
        final List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        new WriterThread(list).start();
        new ReaderThread(list).start();
    }

}

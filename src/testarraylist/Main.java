package testarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Yuery
 * @date 2021/3/25/0025 - 9:51
 */
public class Main {

    public static void main(String[] args){
        final List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        new WriterThread(list).start();
        new ReaderThread(list).start();
    }

}

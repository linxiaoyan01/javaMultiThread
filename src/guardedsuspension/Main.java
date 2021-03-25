package guardedsuspension;

import java.util.Queue;

/**
 * @author Yuery
 * @date 2021/3/25/0025 - 12:51
 */
public class Main {
    public static void main(String[] args){
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue,"Alice",3141592L).start();
        new ServerThread(requestQueue,"Bobby",6535897L).start();
    }
}

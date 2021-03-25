package threadstart;

/**
 * @author Yuery
 * @date 2021/3/23/0023 - 13:26
 */
public class ThreadStart1 extends Thread {
    /**利用Thread类的子类——线程的启动*/
    private final String message;
    public ThreadStart1(String message){
        this.message = message;
    }
    @Override
    public void run(){
        int n = 1000;
        for(int i = 0; i < n; i++){
            System.out.println(message);
        }
    }

}

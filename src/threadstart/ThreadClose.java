package threadstart;

/**
 * @author Yuery
 * @date 2021/3/23/0023 - 21:13
 */
public class ThreadClose {
    public static void main(String[] args){
        int  m = 10;
        for(int i = 0; i < m; i++) {
            System.out.println("Good");
            try {
                int n = 1000;
                Thread.sleep(n);
            } catch (InterruptedException ignored) {

            }
        }
    }
}

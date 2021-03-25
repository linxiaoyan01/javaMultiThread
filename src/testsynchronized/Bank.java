package testsynchronized;

/**
 * @author Yuery
 * @date 2021/3/23/0023 - 21:17
 */
public class Bank {
    private  int money;
    private  String name;
    public Bank(int money, String name){
        this.name = name;
        this.money = money;
    }
    public synchronized void deposit(int m){
        money += m;
    }
    public synchronized boolean withdraw(int m){
        if(money >= m){
            money -= m;
            return true;
        }else{
            return false;
        }
    }
    public String getName(){
        return name;
    }
}

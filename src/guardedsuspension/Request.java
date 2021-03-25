package guardedsuspension;

/**
 * @author Yuery
 * @date 2021/3/25/0025 - 12:29
 */
public class Request {
    private final String name;
    public Request(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "[ Request " + name + " ]";
    }
}

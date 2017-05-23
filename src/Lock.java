/**
 * Created by ronald on 22/01/2017.
 */
public class Lock {

    String name;
    int code;

    Lock(){
        this("hello");
        name = "First lock";
        code = 12345;
        System.out.println(name + code);
    }

    protected Lock(String name) {
        this("Third lock", 14569);
        this.name = name;
        System.out.println(name);
    }

    private Lock(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println(name + code);
    }

    public static void main(String[] args) {
        Lock lock = new Lock();
    }
}

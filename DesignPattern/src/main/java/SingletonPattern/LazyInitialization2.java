package SingletonPattern;
/**
 * @className LazyInitialization2
 * @description  线程安全的
 * @author chenyide
 * @date 2024/5/16 15:31
 * @version v1.0
**/

public class LazyInitialization2 {

    private LazyInitialization2() {}

    private static LazyInitialization2 instance;

    public static synchronized LazyInitialization2 getInstance(){
        if (instance == null){
            instance = new LazyInitialization2();
        }
        return instance;
    }
}

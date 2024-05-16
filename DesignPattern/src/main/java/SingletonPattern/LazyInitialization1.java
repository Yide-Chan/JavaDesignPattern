package SingletonPattern;

/**
 * @author chenyide
 * @version v1.0
 * @className LazyInitialization1
 * @description 线程不安全的
 * @date 2024/5/16 15:24
 **/

public class LazyInitialization1 {
    //私有构造方法
    private LazyInitialization1() {
    }

    //在成员位置创建该类的对象
    private static LazyInitialization1 instance;

    //对外提供静态方法获取该对象
    public static LazyInitialization1 getInstance() {
        if (instance == null){
            instance = new LazyInitialization1();
        }
        return instance;
    }
}


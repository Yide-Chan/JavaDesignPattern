package SingletonPattern;

/**
 * @author 陈乙德
 * @version v1.0
 * @className LazyInitialization3
 * @description 双重检查锁
 * 使用 `volatile` 关键字解决双重检查锁模式带来空指针异常的问题
 *
 * `volatile` 关键字可以保证可见性和有序性.
 * @date 2024/5/16 15:34
 **/

public class LazyInitialization3 {
    private LazyInitialization3() {
    }
    // 使用volatile关键字保证有序性
    private static volatile LazyInitialization3 instance;

    public static LazyInitialization3 getInstance() {
        if (instance == null) {
            //抢到锁之后再次判断是否为空,使用当前类的字节码对象作为锁对象
            synchronized (LazyInitialization3.class) {
                instance = new LazyInitialization3();
            }
        }
        return instance;
    }
}

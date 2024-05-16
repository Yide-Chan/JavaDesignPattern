package SingletonPattern;
/**
 * @className LazyInitialization4
 * @description  静态内部类方式
 * 第一次加载Singleton类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加载SingletonHolder
 * 并初始化INSTANCE，这样不仅能确保线程安全，也能保证 Singleton 类的唯一性。
 *
 * @author 陈乙德
 * @date 2024/5/16 15:41
 * @version v1.0
**/

public class LazyInitialization4 {

    //私有构造方法
    private LazyInitialization4() {}

    private static class SingletonHolder {
        private static final LazyInitialization4 INSTANCE = new LazyInitialization4();
    }

    //对外提供静态方法获取该对象
    public static LazyInitialization4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

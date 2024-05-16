package SingletonPattern;

/**
 * @author chenyide
 * @version v1.0
 * @className EagerInitialization1
 * @description 饿汉式
 * 静态变量创建类的对象
 * @date 2024/5/16 15:23
 **/

public class EagerInitialization1 {
    //私有构造方法
    private EagerInitialization1() {
    }

    //在成员位置创建该类的对象
    private static EagerInitialization1 instance = new EagerInitialization1();

    //对外提供静态方法获取该对象
    public static EagerInitialization1 getInstance() {
        return instance;
    }
}

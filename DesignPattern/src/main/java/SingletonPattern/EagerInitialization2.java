package SingletonPattern;
/**
 * @className EagerInitialization2
 * @description  静态代码块方式
 * @author chenyide
 * @date 2024/5/16 15:24
 * @version v1.0
**/

public class EagerInitialization2 {

    //私有构造方法
    private EagerInitialization2() {}

    //在成员位置创建该类的对象
    private static EagerInitialization2 instance;

    static {
        instance = new EagerInitialization2();
    }

    //对外提供静态方法获取该对象
    public static EagerInitialization2 getInstance() {
        return instance;
    }
}

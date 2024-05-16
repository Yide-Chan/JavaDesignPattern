package SingletonPattern;
/**
 * @className Singleton
 * @description  
 * @author 陈乙德
 * @date 2024/5/16 15:45
 * @version v1.0
**/

public class Singleton {
    private Singleton(){
        /* 解决反射破解单例模式需要添加的代码，当通过反射方式调用构造方法进行创建创建时，直接抛异常。不运行此中操作。
        if (instance != null){
            throw new RuntimeException();
        }
         */
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    private Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}

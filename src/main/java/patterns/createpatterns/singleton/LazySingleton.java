package patterns.createpatterns.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author LXF
 * @date 2018/1/17 15:46
 * <p>
 * 单例
 * 它有以下几个要素：
 * 1.私有的构造方法。
 * 2.指向自己实例的私有静态引用。
 * 3.以自己实例为返回值的静态的公有的方法。
 * <p>
 * 懒汉模式 在调用时才会实例化对象
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }
}

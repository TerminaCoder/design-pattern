package patterns.createpatterns.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author LXF
 * @date 2018/1/18 14:44
 * 单例
 * 它有以下几个要素：
 * 1.私有的构造方法。
 * 2.指向自己实例的私有静态引用。
 * 3.以自己实例为返回值的静态的公有的方法。
 * <p>
 *
 */
public class SingletonTest {
    /**
     * 懒汉模式 在调用时才会实例化对象
     */
    @Test
    public void testLazySingleton() {
        LazySingleton lazySingleton_1 = LazySingleton.getInstance();
        LazySingleton lazySingleton_2 = LazySingleton.getInstance();
        System.out.println(lazySingleton_1);
        System.out.println(lazySingleton_2);
    }

    /**
     * 饿汉模式 单例对象在类被加载的时候实例化 （在java里面饿汉优于懒汉）
     */
    @Test
    public void testHurrySingleton() {
        HurrySingleton hurrySingleton_1 = HurrySingleton.getInstance();
        HurrySingleton hurrySingleton_2 = HurrySingleton.getInstance();
        System.out.println(hurrySingleton_1);
        System.out.println(hurrySingleton_2);
    }
}

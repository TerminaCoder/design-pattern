package patterns.createpatterns.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author LXF
 * @date 2018/1/17 16:14
 *
 * 饿汉模式 单例对象在类被加载的时候实例化 （在java里面饿汉优于懒汉）
 */
public class HurrySingleton {
    private static HurrySingleton hurrySingleton = new HurrySingleton();

    private HurrySingleton() {

    }

    public static HurrySingleton getInstance() {
        return hurrySingleton;
    }



}

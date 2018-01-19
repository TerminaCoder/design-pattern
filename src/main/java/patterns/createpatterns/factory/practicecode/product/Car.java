package patterns.createpatterns.factory.practicecode.product;

import patterns.createpatterns.factory.practicecode.product.productinterface.ICar;
import patterns.createpatterns.factory.practicecode.product.productinterface.IProduct;

/**
 * @author LXF
 * @date 2018/1/17 16:49
 */
public class Car implements ICar {
    public Car(IProduct Engine, IProduct UnderPan, IProduct Wheel) {
        Engine.getStyle();
        UnderPan.getStyle();
        Wheel.getStyle();
    }
    /**
     * 获取产品
     */
    public void show() {
        System.out.println("我是一辆车");
    }
}

package patterns.createpatterns.factory.practicecode.factory;

import patterns.createpatterns.factory.practicecode.product.Car;
import patterns.createpatterns.factory.practicecode.product.Engine;
import patterns.createpatterns.factory.practicecode.product.UnderPan;
import patterns.createpatterns.factory.practicecode.product.Wheel;
import patterns.createpatterns.factory.practicecode.product.productinterface.ICar;
import patterns.createpatterns.factory.practicecode.product.productinterface.IProduct;

/**
 * @author LXF
 * @date 2018/1/17 16:27
 */
public class Factory implements IFactory {
    /**
     * 获取产品实例
     *
     * @return
     */
    public ICar createICar() {
        IProduct engine = new Engine();
        IProduct underPan = new UnderPan();
        IProduct wheel = new Wheel();
        return new Car(engine, underPan, wheel);
    }
}

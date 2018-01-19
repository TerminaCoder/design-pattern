package patterns.createpatterns.factory.practicecode;

import org.junit.jupiter.api.Test;
import patterns.createpatterns.factory.practicecode.factory.Factory;
import patterns.createpatterns.factory.practicecode.factory.IFactory;
import patterns.createpatterns.factory.practicecode.product.productinterface.ICar;

/**
 * @author LXF
 * @date 2018/1/17 16:21
 * 工厂模式
 */
public class FactoryPatternTest {
    @Test
    public void testFactoryPattern() {
        IFactory factory = new Factory();
        ICar car = factory.createICar();
        car.show();
    }
}

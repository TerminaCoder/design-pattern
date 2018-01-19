package patterns.createpatterns.abstractfactory.templetcode;

import org.junit.jupiter.api.Test;
import patterns.createpatterns.abstractfactory.templetcode.factory.Factory;
import patterns.createpatterns.abstractfactory.templetcode.factory.IFactory;
import patterns.createpatterns.abstractfactory.templetcode.product.IProduct;

/**
 * @author LXF
 * @date 2018/1/17 16:21
 * 相比工厂模式 抽象工厂模式创建一组相关或者相互依赖的对象
 */
public class FactoryPatternTest {
    @Test
    public void testFactoryPattern() {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        IProduct product_2 = factory.createProduct_2();
        product.productMethod();
        product_2.productMethod();
    }
}

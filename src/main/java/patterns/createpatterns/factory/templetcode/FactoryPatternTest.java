package patterns.createpatterns.factory.templetcode;

import org.junit.jupiter.api.Test;
import patterns.createpatterns.factory.templetcode.factory.Factory;
import patterns.createpatterns.factory.templetcode.factory.IFactory;
import patterns.createpatterns.factory.templetcode.product.IProduct;

/**
 * @author LXF
 * @date 2018/1/17 16:21
 *工厂模式用来创建一个复杂的对象
 */
public class FactoryPatternTest {
    @Test
    public void testFactoryPattern() {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}

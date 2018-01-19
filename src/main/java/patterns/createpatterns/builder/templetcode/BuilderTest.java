package patterns.createpatterns.builder.templetcode;

import org.junit.jupiter.api.Test;
import patterns.createpatterns.builder.templetcode.builder.Director;
import patterns.createpatterns.builder.templetcode.product.Car;

/**
 * @author LXF
 * @date 2018/1/18 9:37
 * 建造模式 封装工厂类的具体实现 创建比工厂模式更加复杂的对象
 */
public class BuilderTest {
    @Test
    public void testBuilder() {
        Director director = new Director();
        Car carA = director.getACar();
        carA.showProduct();
        Car carB = director.getBCar();
        carB.showProduct();
    }
}

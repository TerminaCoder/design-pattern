package patterns.createpatterns.builder.templetcode.builder;

import patterns.createpatterns.builder.templetcode.product.Car;

/**
 * @author LXF
 * @date 2018/1/18 9:31
 *
 * 导演类 封装工厂类的具体实现 创建比工厂模式更加复杂的对象
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    public Car getACar() {
        builder.setPart("宝马","X7");
        return builder.getProduct();
    }

    public Car getBCar() {
        builder.setPart("奥迪","Q5");
        return builder.getProduct();
    }

}

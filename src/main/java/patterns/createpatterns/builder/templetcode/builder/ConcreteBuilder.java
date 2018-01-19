package patterns.createpatterns.builder.templetcode.builder;

import patterns.createpatterns.builder.templetcode.product.Car;

/**
 * @author LXF
 * @date 2018/1/18 9:29
 */
public class ConcreteBuilder extends Builder {
    private Car car = new Car();

    @Override
    public void setPart(String name, String type) {
        car.setName(name);
        car.setType(type);
    }

    @Override
    public Car getProduct() {
        return car;
    }
}

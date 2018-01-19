package patterns.createpatterns.factory.practicecode.product;

import patterns.createpatterns.factory.practicecode.product.productinterface.IProduct;

/**
 * @author LXF
 * @date 2018/1/17 16:44
 */
public class Wheel implements IProduct {
    /**
     * 获取产品
     */
    public void getStyle() {
        System.out.println("这是汽车的轮子");
    }
}

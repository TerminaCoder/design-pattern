package patterns.createpatterns.factory.practicecode.product;

import patterns.createpatterns.factory.practicecode.product.productinterface.IProduct;

/**
 * @author LXF
 * @date 2018/1/17 16:43
 */
public class UnderPan implements IProduct {
    public void getStyle() {
        System.out.println("这是汽车的底盘");
    }
}

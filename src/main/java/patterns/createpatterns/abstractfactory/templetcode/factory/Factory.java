package patterns.createpatterns.abstractfactory.templetcode.factory;

import patterns.createpatterns.abstractfactory.templetcode.product.IProduct;
import patterns.createpatterns.abstractfactory.templetcode.product.Product;
import patterns.createpatterns.abstractfactory.templetcode.product.Product2;

/**
 * @author LXF
 * @date 2018/1/17 16:27
 */
public class Factory implements IFactory {
    public IProduct createProduct() {
        return new Product();
    }

    public IProduct createProduct_2() {
        return new Product2();
    }
}

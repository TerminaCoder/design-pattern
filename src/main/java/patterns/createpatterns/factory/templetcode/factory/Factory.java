package patterns.createpatterns.factory.templetcode.factory;

import patterns.createpatterns.factory.templetcode.product.IProduct;
import patterns.createpatterns.factory.templetcode.product.Product;

/**
 * @author LXF
 * @date 2018/1/17 16:27
 */
public class Factory implements IFactory {
    public IProduct createProduct() {
        return new Product();
    }
}

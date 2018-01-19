package patterns.createpatterns.factory.templetcode.factory;

import patterns.createpatterns.factory.templetcode.product.IProduct;

/**
 * @author LXF
 * @date 2018/1/17 16:26
 */
public interface IFactory {
    /**
     * 获取产品
     * @return
     */
    IProduct createProduct();
}

package patterns.createpatterns.abstractfactory.templetcode.factory;

import patterns.createpatterns.abstractfactory.templetcode.product.IProduct;

/**
 * @author LXF
 * @date 2018/1/17 16:26
 */
public interface IFactory {
    /**
     * 获取产品1
     * @return
     */
    IProduct createProduct();

    /**获取产品2
     * @return
     */
    IProduct createProduct_2();
}

package patterns.createpatterns.factory.practicecode.factory;

import patterns.createpatterns.factory.practicecode.product.productinterface.ICar;

/**
 * @author LXF
 * @date 2018/1/17 16:26
 */
public interface IFactory {
    /**
     * 获取产品实例
     * @return
     */
    ICar createICar();
}

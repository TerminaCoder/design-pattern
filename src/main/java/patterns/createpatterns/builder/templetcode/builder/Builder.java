package patterns.createpatterns.builder.templetcode.builder;

import patterns.createpatterns.builder.templetcode.product.Car;

/**
 * @author LXF
 * @date 2018/1/18 9:25
 */
public abstract class Builder {
    /**
     * 设置
     * @param name
     * @param type
     */
    public abstract void setPart(String name, String type);

    /**
     * 获取
     * @return
     */
    public abstract Car getProduct();
}

package patterns.createpatterns.prototype.deep;

/**
 * @author LXF
 * @date 2018/1/18 11:01
 */
public class ConcretePrototypeDeep extends PrototypeDeep {
    public void show() {
        this.list.add("1");
        System.out.println("原型模式实现类深度拷贝" + this.list.toString());
    }
}

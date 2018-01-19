package patterns.createpatterns.prototype;

import org.junit.jupiter.api.Test;
import patterns.createpatterns.prototype.deep.ConcretePrototypeDeep;
import patterns.createpatterns.prototype.ConcretePrototype;

/**
 * @author LXF
 * @date 2018/1/18 10:17
 * 原型模式
 */
public class PrototypeTest {
    @Test
    public void TestPrototype() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        int a = 10;
        for (int i = 0; i < a; i++) {
            ConcretePrototype cloneCp = (ConcretePrototype) concretePrototype.clone();
            cloneCp.show();
        }
    }

    @Test
    public void TestPrototypeDeep() {
        ConcretePrototypeDeep concretePrototypeDeep = new ConcretePrototypeDeep();
        int a = 10;
        for (int i = 0; i < a; i++) {
            ConcretePrototypeDeep cloneCp = (ConcretePrototypeDeep) concretePrototypeDeep.clone();
            cloneCp.show();
        }
    }
}

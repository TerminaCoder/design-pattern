package patterns.behaviorpatterns.observer;

import patterns.behaviorpatterns.observer.abstractclass.Subject;
import patterns.behaviorpatterns.observer.abstractclass.concreteclass.ConcreteSubject;
import patterns.behaviorpatterns.observer.interfaceclass.Observer;
import patterns.behaviorpatterns.observer.interfaceclass.interfaceclassimpl.ConcreteObserver1;
import patterns.behaviorpatterns.observer.interfaceclass.interfaceclassimpl.ConcreteObserver2;

/**
 * @author LXF
 * @date 2018/1/22 15:23
 * 观察者模式机制： 被观察者的性质或者说属性发生变化时 观察者自动触发事件
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();

        Observer concreteObserver1 = new ConcreteObserver1();
        Observer concreteObserver2 = new ConcreteObserver2();

        sub.addObserver(concreteObserver1);
        sub.addObserver(concreteObserver2);
        sub.doSomething();

        System.out.println("");

        System.out.println("删除一个监听对象");
        sub.delObserver(concreteObserver1);
        sub.doSomething();
    }
}

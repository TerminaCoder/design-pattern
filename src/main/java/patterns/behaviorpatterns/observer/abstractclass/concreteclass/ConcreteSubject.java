package patterns.behaviorpatterns.observer.abstractclass.concreteclass;

import patterns.behaviorpatterns.observer.abstractclass.Subject;

/**
 * @author LXF
 * @date 2018/1/22 15:19
 * 具体被观察者类
 */
public class ConcreteSubject extends Subject {
    @Override
    public void doSomething() {
        System.out.println("被观察者事件发生");
        this.notifyObserver();
    }
}

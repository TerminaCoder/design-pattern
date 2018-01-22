package patterns.behaviorpatterns.observer.interfaceclass.interfaceclassimpl;

import patterns.behaviorpatterns.observer.interfaceclass.Observer;

/**
 * @author LXF
 * @date 2018/1/22 15:23
 * 具体观察者类2
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("被观察者2收到信息，并进行处理");
    }
}

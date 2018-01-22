package patterns.behaviorpatterns.observer.interfaceclass.interfaceclassimpl;

import patterns.behaviorpatterns.observer.interfaceclass.Observer;

/**
 * @author LXF
 * @date 2018/1/22 15:22
 * 具体观察者类1
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("被观察者1收到信息，并进行处理");
    }
}

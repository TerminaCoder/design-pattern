package patterns.behaviorpatterns.observer.abstractclass;

import patterns.behaviorpatterns.observer.interfaceclass.Observer;

import java.util.Vector;

/**
 * @author LXF
 * @date 2018/1/22 15:13
 * 被观察者类
 */
public abstract class Subject {
    private Vector<Observer> obs = new Vector<>();

    public void addObserver(Observer obs) {
        this.obs.add(obs);
    }

    public void delObserver(Observer obs) {
        this.obs.remove(obs);
    }

    protected void notifyObserver() {
        for (Observer o : obs) {
            o.update();
        }
    }

    /**
     *
     */
    public abstract void doSomething();
}

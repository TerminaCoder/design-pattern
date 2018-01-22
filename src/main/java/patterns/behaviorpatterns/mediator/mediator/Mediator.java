package patterns.behaviorpatterns.mediator.mediator;

import patterns.behaviorpatterns.mediator.mediator.abstractclass.AbstractColleague2;
import patterns.behaviorpatterns.mediator.mediator.abstractclass.AbstractMediator;

/**
 * @author LXF
 * @date 2018/1/22 14:38
 * 中介类
 */
public class Mediator extends AbstractMediator {
    public Mediator(AbstractColleague2 a, AbstractColleague2 b) {
        super(a, b);
    }

    @Override
    public void AAffectB() {
        int number = A.getNumber();
        B.setNumber(number * 100);
    }

    @Override
    public void BAffectA() {
        int number = B.getNumber();
        A.setNumber(number / 100);
    }
}

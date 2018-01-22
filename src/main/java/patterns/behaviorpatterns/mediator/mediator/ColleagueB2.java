package patterns.behaviorpatterns.mediator.mediator;

import patterns.behaviorpatterns.mediator.mediator.abstractclass.AbstractColleague2;
import patterns.behaviorpatterns.mediator.mediator.abstractclass.AbstractMediator;

/**
 * @author LXF
 * @date 2018/1/19 17:34
 */
public class ColleagueB2 extends AbstractColleague2 {

    @Override
    public void setNumber(int number, AbstractMediator abstractMediator) {
        this.number = number;
        abstractMediator.BAffectA();
    }
}

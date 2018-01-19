package patterns.behaviorpatterns.mediator.nomediator;

import patterns.behaviorpatterns.mediator.nomediator.abstractclass.AbstractColleague;

/**
 * @author LXF
 * @date 2018/1/19 17:32
 */
public class ColleagueA extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractColleague abstractColleague) {
        this.number = number;
        // B的number值乘以100
        abstractColleague.setNumber(number * 100);
    }
}

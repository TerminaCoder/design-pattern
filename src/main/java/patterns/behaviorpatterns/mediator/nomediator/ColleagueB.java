package patterns.behaviorpatterns.mediator.nomediator;

import patterns.behaviorpatterns.mediator.nomediator.abstractclass.AbstractColleague;

/**
 * @author LXF
 * @date 2018/1/19 17:34
 */
public class ColleagueB extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractColleague abstractColleague) {
        this.number = number;
        // A的number值除以100
        abstractColleague.setNumber(number / 100);
    }
}

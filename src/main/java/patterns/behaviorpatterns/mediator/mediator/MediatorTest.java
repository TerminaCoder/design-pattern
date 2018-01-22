package patterns.behaviorpatterns.mediator.mediator;

import patterns.behaviorpatterns.mediator.mediator.abstractclass.AbstractColleague2;
import patterns.behaviorpatterns.mediator.mediator.abstractclass.AbstractMediator;

/**
 * @author LXF
 * @date 2018/1/19 17:45
 * 中介者模式 将网状结构变为星状结构
 */
public class MediatorTest {
    public static void main(String[] args) {
        AbstractColleague2 abstractColleagueA = new ColleagueA2();
        AbstractColleague2 abstractColleagueB = new ColleagueB2();
        AbstractMediator abstractMediator = new Mediator(abstractColleagueA, abstractColleagueB);

        System.out.println("====设置A影响B==========");

        abstractColleagueA.setNumber(1288, abstractMediator);
        System.out.println("A的值： " + abstractColleagueA.getNumber());
        System.out.println("B的值： " + abstractColleagueB.getNumber());

        System.out.println("====设置B影响A==========");
        abstractColleagueB.setNumber(1200, abstractMediator);
        System.out.println("A的值： " + abstractColleagueA.getNumber());
        System.out.println("B的值： " + abstractColleagueB.getNumber());
    }
}

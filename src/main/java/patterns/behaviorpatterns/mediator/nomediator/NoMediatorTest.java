package patterns.behaviorpatterns.mediator.nomediator;

import org.junit.jupiter.api.Test;
import patterns.behaviorpatterns.mediator.nomediator.abstractclass.AbstractColleague;

/**
 * @author LXF
 * @date 2018/1/19 17:45
 */
public class NoMediatorTest {
    public static void main(String[] args) {
        AbstractColleague abstractColleagueA = new ColleagueA();
        AbstractColleague abstractColleagueB = new ColleagueB();
        System.out.println("====设置A影响B==========");

        abstractColleagueA.setNumber(1288, abstractColleagueB);
        System.out.println("A的值： " + abstractColleagueA.getNumber());
        System.out.println("B的值： " + abstractColleagueB.getNumber());

        System.out.println("====设置B影响A==========");
        abstractColleagueB.setNumber(1200, abstractColleagueA);
        System.out.println("A的值： " + abstractColleagueA.getNumber());
        System.out.println("B的值： " + abstractColleagueB.getNumber());
    }
//    @Test
//    public void testNoMediator() {
//        AbstractColleague abstractColleagueA = new ColleagueA();
//        AbstractColleague abstractColleagueB = new ColleagueB();
//        System.out.println("====设置A影响B==========");
//
//        abstractColleagueA.setNumber(1288, abstractColleagueB);
//        System.out.println("A的值： " + abstractColleagueA.getNumber());
//        System.out.println("B的值： " + abstractColleagueB.getNumber());
//
//        System.out.println("====设置B影响A==========");
//        abstractColleagueB.setNumber(1200, abstractColleagueA);
//        System.out.println("A的值： " + abstractColleagueA.getNumber());
//        System.out.println("B的值： " + abstractColleagueB.getNumber());
//    }
}

package patterns.behaviorpatterns.templatemethod;

import org.junit.jupiter.api.Test;
import patterns.behaviorpatterns.templatemethod.abstractclass.AbstractSort;

/**
 * @author LXF
 * @date 2018/1/19 16:20
 * 模板方法模式 创建一个抽象类完成主要的逻辑， 在子类完成具体的操作
 */
public class ConcreteSortTest {
    @Test
    public void test() {
        //Arrays(数组复合操作)
        //Collections(集合框架复合操作)
        //java都是引用对象 如果是全局的或者局部的变量 改了的话 在本类的哪里调用都会被改， 只不过局部变量在本方法里面才有效
        int[] a = {
                10, 32, 1, 9, 5, 7, 12, 0, 4, 3
        };
        System.out.println("局部变量");
        AbstractSort abstractSort = new ConcreteSort();
        abstractSort.showSortResult(a);
    }
}

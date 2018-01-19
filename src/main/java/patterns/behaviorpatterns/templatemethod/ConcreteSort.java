package patterns.behaviorpatterns.templatemethod;

import patterns.behaviorpatterns.templatemethod.abstractclass.AbstractSort;

import java.util.Arrays;

/**
 * @author LXF
 * @date 2018/1/19 16:14
 */
public class ConcreteSort extends AbstractSort {
    @Override
    protected void sort(int[] array) {
        //Arrays Collections
        System.out.println("开始排序");
        //java都是引用对象 如果是全局的变量 改了的话 在本类的哪里调用都会被改
        Arrays.sort(array);
//        for (int i = 0; i < array.length - 1; i++) {
//            selectSort(array, i);
//        }
    }

    private void selectSort(int[] array, int index) {
        int minValue = 32767;
        int indexMin = 0;
        int temp;
        for (int i = index; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                indexMin = i;
            }
        }
        temp = array[index];
        array[index] = array[indexMin];
        array[indexMin] = temp;
    }
}

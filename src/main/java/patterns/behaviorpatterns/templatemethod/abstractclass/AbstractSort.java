package patterns.behaviorpatterns.templatemethod.abstractclass;

/**
 * @author LXF
 * @date 2018/1/19 16:01
 */
public abstract class AbstractSort {
    /**
     * 排序的方法
     *
     * @param array
     */
    protected abstract void sort(int[] array);

    public void showSortResult(int[] array) {
        this.sort(array);
        System.out.println("排序结果：");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3s", array[i]);
        }
    }
}

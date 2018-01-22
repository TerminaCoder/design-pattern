package patterns.behaviorpatterns.mediator.mediator.abstractclass;

/**
 * @author LXF
 * @date 2018/1/19 17:29
 */
public abstract class AbstractColleague2 {
    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 类关联的setNumber方法
     * @param number
     * @param abstractMediator
     */
    public abstract void setNumber(int number, AbstractMediator abstractMediator);

}

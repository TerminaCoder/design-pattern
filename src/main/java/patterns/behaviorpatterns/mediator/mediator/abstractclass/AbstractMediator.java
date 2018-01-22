package patterns.behaviorpatterns.mediator.mediator.abstractclass;

/**
 * @author LXF
 * @date 2018/1/22 14:31
 */
public abstract class AbstractMediator {
    protected AbstractColleague2 A;
    protected AbstractColleague2 B;

    public AbstractMediator(AbstractColleague2 a, AbstractColleague2 b) {
        A = a;
        B = b;
    }

    public abstract void AAffectB();

    public abstract void BAffectA();
}

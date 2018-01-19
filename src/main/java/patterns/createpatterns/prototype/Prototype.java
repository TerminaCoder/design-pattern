package patterns.createpatterns.prototype;

/**
 * @author LXF
 * @date 2018/1/18 9:58
 * 发生深拷贝只有8种基本类型和以及他们的包装类，还有String类型
 *深拷贝就是不拷贝数组，容器对象和引用对象
 * byte short int  long  float  double  char  boolean
 */
public class Prototype implements Cloneable {
    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}

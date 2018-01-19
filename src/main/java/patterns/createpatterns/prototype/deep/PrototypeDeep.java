package patterns.createpatterns.prototype.deep;

import java.util.ArrayList;

/**
 * @author LXF
 * @date 2018/1/18 10:57
 */
public class PrototypeDeep implements Cloneable {
    public ArrayList<String> list = new ArrayList<String>(1);

    @Override
    public PrototypeDeep clone() {
        PrototypeDeep prototype = null;
        try {
            prototype = (PrototypeDeep) super.clone();
            //这段代码 就是用来深度拷贝list 不然所有拷贝的对象的list引用指向同一个list的对象
             prototype.list = (ArrayList)this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

}

package patterns.createpatterns.builder.templetcode.product;

/**
 * @author LXF
 * @date 2018/1/18 9:23
 */
public class Car {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showProduct() {
        System.out.println("名称 " + name);
        System.out.println("类型 " + type);
    }
}

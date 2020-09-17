package innerclass;

/**
 * @author Administrator
 */

public enum ColorsEnum {
    //红色
    RED("红色", 1),
    //兰色
    BLUE("蓝色", 2),
    //黄色
    YELLOW("黄色", 3),
    //绿色
    GREEN("绿色", 4),
    //灰色
    GRAY("灰色",5);
    ColorsEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }
    private String name;
    private int index;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}

class EnumTest {
    public static void main(String[] args) {
        System.out.println(ColorsEnum.RED.getName());
        System.out.println(ColorsEnum.BLUE.getIndex());
    }

}

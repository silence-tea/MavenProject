package clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.age = 5;
        // 克隆
        Dog dog3 = (Dog) dog.clone();
        dog.name = "小白";
        dog.age = 2;
        System.out.println(dog.name + "，" + dog.age + "岁");
        System.out.println(dog3.name + "，" + dog3.age + "岁");
    }
}
class Dog implements Cloneable {
    public String name;
    public int age;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

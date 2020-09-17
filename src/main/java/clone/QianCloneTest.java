package clone;

public class QianCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        DogChild dogChild = new DogChild();
        dogChild.name = "二狗";
        Dog1 dog4 = new Dog1();
        dog4.name = "大黄";
        dog4.dogChild = dogChild;
        Dog1 dog5 = (Dog1) dog4.clone();
        dog5.name = "旺财";
        dog5.dogChild.name = "狗二";
        System.out.println("dog name 4：" + dog4.name);
        System.out.println("dog name 5：" + dog5.name);
        System.out.println("dog child name 4：" + dog4.dogChild.name);
        System.out.println("dog child name 5：" + dog5.dogChild.name);
    }
}

class Dog1 implements Cloneable {
    public String name;
    public DogChild dogChild;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class DogChild {
    public String name;
}

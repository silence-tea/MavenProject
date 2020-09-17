package comparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Dog1[] dogs = new Dog1[]{
                new Dog1("老旺财", 10),
                new Dog1("小旺财", 3),
                new Dog1("二旺财", 5),
        };
        // Comparator 排序
        Arrays.sort(dogs,new DogComparator());
        for (Dog1 d : dogs) {
            System.out.println(d.getName() + "：" + d.getAge());
        }
    }
}
class DogComparator implements Comparator<Dog1> {
    @Override
    public int compare(Dog1 o1, Dog1 o2) {
        return o1.getAge() - o2.getAge();
    }
}
class Dog1 {
    private String name;
    private int age;
    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
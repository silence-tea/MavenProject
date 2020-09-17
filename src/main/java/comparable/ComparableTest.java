package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog("老旺财", 10),
                new Dog("小旺财", 3),
                new Dog("二旺财", 5),
        };
        List<Integer> intList = new ArrayList<>();
        intList.add(9);
        intList.add(5);
        intList.add(7);
        int[] intArr = {6,3,6,7,8};
        // Comparable 排序
        Arrays.sort(dogs);
        Arrays.sort(intArr);
        intList.sort(Integer::compareTo);
        for (Dog d : dogs) {
            System.out.println(d.getName() + "：" + d.getAge());
        }
        for(int a:intList){
            System.out.println(a);
        }
    }
}

class Dog implements Comparable<Dog> {
    private String name;
    private int age;
    @Override
    public int compareTo(Dog o) {
        return age - o.age;
    }
    public Dog(String name, int age) {
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

class Cat implements Comparable<Cat>{
    private int age;
    private String name;
    @Override
    public int compareTo(Cat o) {
        return age-o.age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

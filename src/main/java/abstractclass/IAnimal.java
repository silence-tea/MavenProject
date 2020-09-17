package abstractclass;
/**
 * @author Administrator
 */
@FunctionalInterface
public interface IAnimal {
    static String animalName = "Animal Name";
    static void printSex() {
        System.out.println("Male Dog");
    }
    default void printAge() {
        System.out.println("18");
    }
    void sayHi(String name);
}

class FunctionInterfaceTest {
    public static void main(String[] args) {
        IAnimal animal = System.out::println;
        animal.sayHi("xx");
    }
}

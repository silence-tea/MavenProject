package abstractclass;

/**
 * @author Administrator
 */
abstract class AbstractAnimal {
    AbstractAnimal() {
        System.out.println("Init AbstractAnimal.");
    }
    static String name = "AbstractAnimal";
    public abstract void eat();
    public void run() {
        System.out.println("AbstractAnimal Run.");
    }
}
class Animal extends AbstractAnimal {
    public static void main(String[] args) {
        AbstractAnimal abstractAnimal = new Animal();
        abstractAnimal.run();
        System.out.println(Animal.name);
        abstractAnimal.eat();
    }


    @Override
    public void eat() {
        System.out.println("Animal Eat.");
    }
}

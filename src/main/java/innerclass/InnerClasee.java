package innerclass;

public class InnerClasee {

    public InnerClasee() {
        System.out.println("Outer Class.");
    }
    class Inner {
        public void sayHi() {
            System.out.println("Hi, Inner.");
        }
    }
}

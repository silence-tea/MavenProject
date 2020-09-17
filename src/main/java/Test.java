import java.util.*;

public class Test {
    private static final Object PRESENT = new Object();

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(PRESENT);
        System.out.println(PRESENT);
        for (Object o : list) {
            System.out.println(o
            );
        }
    }
}

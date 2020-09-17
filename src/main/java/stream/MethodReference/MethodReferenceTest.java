package stream.MethodReference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Administrator
 */
public class MethodReferenceTest {
    /**
     * 注意：
     * 1.lambda体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的函数列表和返回值类型保持一致！
     * 2.若lambda参数列表中的第一个参数是实例方法的调用者，而第二个参数是实例方法的参数时，可以使用ClassName::method
     * (a) 方法引用
     * 三种表现形式：
     * 1. 对象：：实例方法名
     * 2. 类：：静态方法名
     * 3. 类：：实例方法名 （lambda参数列表中第一个参数是实例方法的调用 者，第二个参数是实例方法的参数时可用）
     */
    @Test
    public void test1() {
        Consumer<Integer> con = (x) -> System.out.println(x);
        con.accept(100);

        // 方法引用-对象::实例方法
        Consumer<Integer> con2 = System.out::println;
        con2.accept(200);

        // 方法引用-类名::静态方法名
        BiFunction<Integer, Integer, Integer> biFun = (x, y) -> Integer.compare(x, y);
        BiFunction<Integer, Integer, Integer> biFun2 = Integer::compare;
        Integer result = biFun2.apply(100, 200);
        System.out.println(result);

        // 方法引用-类名::实例方法名
        BiFunction<String, String, Boolean> fun1 = (str1, str2) -> str1.equals(str2);
        BiFunction<String, String, Boolean> fun2 = String::equals;
        Boolean result2 = fun2.apply("hello", "hello");
        System.out.println(result2);
    }

    /**
     * (b)构造器引用
     * 格式：ClassName::new
     */
    @Test
    public void test2() {
        // 构造方法引用  类名::new
        Supplier<Employee> sup = () -> new Employee();
        System.out.println(sup.get());
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());

        // 构造方法引用 类名::new （带一个参数）
        Function<Integer, Employee> fun = (x) -> new Employee(x);
        Function<Integer, Employee> fun2 = Employee::new;
        System.out.println(fun2.apply(100));
    }

    /**
     * (c)数组引用
     *
     * 格式：Type[]::new
     */
    @Test
    public void test3(){
        // 数组引用
        Function<Integer, String[]> fun = (x) -> new String[x];
        Function<Integer, String[]> fun2 = String[]::new;
        String[] strArray = fun2.apply(2);
        Arrays.stream(strArray).forEach(System.out::println);
    }
}

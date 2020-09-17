package asyn;
import org.junit.jupiter.api.Test;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
public class AsynTest {

    @Async
    void test1() {
        long starTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.print("i: " + i + " ");
        }
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-starTime));
    }


    void test2() {
        for (int j = 100; j < 200; j++) {
            System.out.print("j: " + j + " ");
        }
    }

    @Test
    public void start() {
        test1();
        test2();
        System.out.println("start!!!!");
    }
}

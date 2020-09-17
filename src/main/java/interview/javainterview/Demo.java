package interview.javainterview;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
    }

    @Test
    public void getToday() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime tomorrow = now.plusDays(1);
        System.out.println(tomorrow);
    }

    @Test
    public void breakForeach() {
        for (int i = 0; i < 10; i++) {
           myfor: for (int j = 0; j < 10; j++) {
                System.out.print("*");
                if (j == 5) {
                    System.out.println();
                    break myfor;
                }
            }
        }
    }

}

package interview.shujuleixing;


import org.junit.jupiter.api.Test;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(str.substring(3, 4));

        String str1 = null;
        System.out.println("".equals(str1));
    }

    @Test
    public void 集合比较() {
        String[] strArr = {"dog", "cat", "pig", "bird"};
        String[] strArr2 = {"dog", "cat", "pig", "bird"};

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.equals(strArr, strArr2));
        System.out.println(strArr.equals(strArr2));
        System.out.println(strArr == strArr2);
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.binarySearch(strArr, "bird"));
        Arrays.fill(strArr,1,3,"hhh");
        System.out.println(Arrays.toString(strArr));
    }

    @Test
    @Scheduled(cron = "1/5 0 0 * * *")
    public void scheduledTest() {
        System.out.println(LocalDateTime.now());
    }
}

package interview.shujuleixing;

import org.junit.jupiter.api.Test;

public class Demo {
    //高频区间
    @Test
    public void test(){
        // Integer 高频区缓存范围 -128~127
        Integer num1 = 127;
        Integer num2 = 127;
        int int1 = 127;
        int int2 = 127;
        System.out.println("值127 int1 == int2 => " + (int1 == int2));
        // Integer 取值 127 == 结果为 true（值127 num1==num2 => true）
        System.out.println("值127 num1==num2 => " + (num1 == num2));
        Integer num3 = 128;
        Integer num4 = 128;
        int int3 = 128;
        int int4 = 128;
        // Integer 取值 128 == 结果为 false（值128 num3==num4 => false）
        System.out.println("值127 int3 == int4 => " + (int3 == int4));
        System.out.println("值128 num3==num4 => " + (num3 == num4));
    }
}

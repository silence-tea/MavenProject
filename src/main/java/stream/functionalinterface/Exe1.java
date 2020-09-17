package stream.functionalinterface;

public class Exe1 {
    public static void main(String[] args) {
        ReturnOneParam lambda1 = a -> doubleNum(a);
        System.out.println(lambda1.method(3));
        ReturnOneParam returnOneParam1 = new ReturnOneParam() {
            @Override
            public int method(int a) {
                return doubleNum(a);
            }
        };
        System.out.println(returnOneParam1.method(3));
        //lambda2 引用了已经实现的 doubleNum 方法
        ReturnOneParam lambda2 = Exe1::doubleNum;
        System.out.println(lambda2.method(3));
        ReturnOneParam returnOneParam2 = Exe1::doubleNum;
        returnOneParam2.method(3);
        Exe1 exe = new Exe1();

        //lambda4 引用了已经实现的 addTwo 方法
        ReturnOneParam lambda4 = exe::addTwo;
        System.out.println(lambda4.method(2));
    }

    /**
     * 要求
     * 1.参数数量和类型要与接口中定义的一致
     * 2.返回值类型要与接口中定义的一致
     */
    private static int doubleNum(int a) {
        return a * 2;
    }


    private int addTwo(int a) {
        return a + 2;
    }

}

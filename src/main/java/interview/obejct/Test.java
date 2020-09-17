package interview.obejct;

public class Test {
    Son son1 = new Son();

    public static void main(String[] args) {
        Son son = new Son();
        son.setName("xx");
        son.setAge("18");
        son.setSex("男");
        测试 测试 = new 测试();
        测试.set年龄("18");
        测试.set性别("男");
        System.out.println(测试.toString());
    }

    public static class 测试{
        private String 年龄;
        private String 性别;

        public String get年龄() {
            return 年龄;
        }

        public void set年龄(String 年龄) {
            this.年龄 = 年龄;
        }

        public String get性别() {
            return 性别;
        }

        public void set性别(String 性别) {
            this.性别 = 性别;
        }

        @Override
        public String toString() {
            return "测试{" +
                    "年龄='" + 年龄 + '\'' +
                    ", 性别='" + 性别 + '\'' +
                    '}';
        }
    }


}

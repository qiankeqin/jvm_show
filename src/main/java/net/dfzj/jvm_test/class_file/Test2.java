package net.dfzj.jvm_test.class_file;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-09-27 16:58
 */
public class Test2 {
    String str = "welcome";

    private int x = 5;

    public static Integer in = 10;

    public static void main(String[] args) {
        Test2 test2 = new Test2();

        test2.setX(8);

        in = 20;
    }

    public void setX(int x) {
        this.x = x;
    }
}
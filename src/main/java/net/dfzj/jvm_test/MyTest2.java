package net.dfzj.jvm_test;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-07 08:45
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.i);
    }
}

class MyParent2{
    public static final String str = "hello world";

    public static final short s = 128;

    public static final int i = 1;
    static {
        System.out.println("MyParents static block");
    }
}
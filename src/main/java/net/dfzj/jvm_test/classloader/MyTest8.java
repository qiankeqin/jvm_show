package net.dfzj.jvm_test.classloader;

import java.util.Random;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-14 12:54
 */
public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}

class FinalTest{

    public static final int x = new Random().nextInt(3);

    static {
        System.out.println("FinalTest static block");
    }
}
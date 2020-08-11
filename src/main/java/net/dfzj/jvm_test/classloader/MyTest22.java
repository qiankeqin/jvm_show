package net.dfzj.jvm_test.classloader;

import net.dfzj.jvm_test.MyTest2;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-10 08:38
 */
public class MyTest22 {
    static {
        System.out.println("MyTest22 initializer");
    }

    public static void main(String[] args) {
        System.out.println(MyTest22.class.getClassLoader());
        System.out.println(MyTest2.class.getClassLoader());
    }
}
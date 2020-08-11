package net.dfzj.jvm_test.classloader;

import sun.misc.Launcher;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-10 17:46
 */
public class MyTest24 {
    public static void main(String[] args) {

        System.out.println(ClassLoader.class.getClassLoader());
        System.out.println(Launcher.class.getClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(System.getProperty("java.system.class.loader"));
        System.out.println(MyTest24.class.getClassLoader());
        System.out.println(MyClass16.class.getClassLoader());
    }
}
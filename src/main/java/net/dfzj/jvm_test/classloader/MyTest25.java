package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-11 08:47
 */
public class MyTest25 {
    public static void main(String[] args) {
         Thread ct = Thread.currentThread();
        System.out.println(ct.getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());
    }
}
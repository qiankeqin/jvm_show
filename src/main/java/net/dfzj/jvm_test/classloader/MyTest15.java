package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-21 09:03
 */
public class MyTest15 {
    public static void main(String[] args) {
        String[] str = new String[1];
        System.out.println(str.getClass());
        System.out.println(str.getClass().getClassLoader());
        int[] chars = new int[1];
        System.out.println(chars.getClass());
        System.out.println(chars.getClass().getClassLoader());
        Integer[] i2 = new Integer[1];
        System.out.println(i2.getClass());
        System.out.println(i2.getClass().getClassLoader());
        MyTest15[] myTest15s = new MyTest15[1];
        System.out.println(myTest15s.getClass());
        System.out.println(myTest15s.getClass().getClassLoader());
    }
}
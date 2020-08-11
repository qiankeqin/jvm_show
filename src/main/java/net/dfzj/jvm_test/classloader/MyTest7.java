package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-14 09:08
 */
public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());;

        Class<?> clazzC = Class.forName("net.dfzj.jvm_test.classloader.C");
        System.out.println(clazzC.getClassLoader());
    }
}

class C {

}
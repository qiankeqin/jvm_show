package net.dfzj.jvm_test.classloader;

import java.lang.reflect.Method;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-04 13:16
 */
public class MyTest20 {
    public static void main(String[] args) throws Exception {
        MyClass16 loader1 = new MyClass16("loader1");
        MyClass16 loader2 = new MyClass16("loader2");

        Class<?> clazz1 = loader1.loadClass("net.dfzj.jvm_test.classloader.MyPerson");
        Class<?> clazz2 = loader2.loadClass("net.dfzj.jvm_test.classloader.MyPerson");

        System.out.println(clazz1 == clazz2);

        Object instance = clazz1.newInstance();
        Object instance1 = clazz2.newInstance();

        Method setMyPerson = clazz1.getMethod("setMyPerson", Object.class);
        setMyPerson.invoke(instance, instance1);
    }
}
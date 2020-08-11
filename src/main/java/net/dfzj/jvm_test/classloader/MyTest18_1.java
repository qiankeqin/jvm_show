package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-04 08:59
 */
public class MyTest18_1 {
    public static void main(String[] args) throws Exception {
        MyClass16 loader1 = new MyClass16("loader1");
        loader1.setPath("/Users/qiankeqin/Documents/develop/sourcecode/test_class/classloader");
        Class<?> clazz = loader1.loadClass("net.dfzj.jvm_test.MyTest2");
        System.out.println("class: "+clazz.hashCode());
        System.out.println("class loader:" + clazz.getClassLoader());
    }
}
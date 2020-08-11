package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-03 10:04
 */
public class MyTest17_1 {
    public static void main(String[] args) throws Exception {
        MyClass16 loader1 = new MyClass16("loader1");
        loader1.setPath("/Users/qiankeqin/Documents/develop/sourcecode/test_class/");
        Class<?> clazz = loader1.loadClass("net.dfzj.jvm_test.classloader.MySample");
        System.out.println("class:" + clazz.hashCode());

        //利用反射第一次使用类，会执行初始化
        Object object = clazz.newInstance();

    }
}
package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-03 08:34
 */
public class MyTest17 {
    public static void main(String[] args) throws Exception {
        MyClass16 loader1 = new MyClass16("loader1");

        Class<?> clazz = loader1.loadClass("net.dfzj.jvm_test.classloader.MySample");
        System.out.println("class:" + clazz.hashCode());

        //利用反射第一次使用类，会执行初始化
//        Object object = clazz.newInstance();

    }
}
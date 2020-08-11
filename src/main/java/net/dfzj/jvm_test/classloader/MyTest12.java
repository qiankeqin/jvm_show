package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-15 13:08
 */
public class MyTest12 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        //加载类型
        Class<?> clazz = classLoader.loadClass("net.dfzj.jvm_test.classloader.CL");
        System.out.println(clazz);
        System.out.println("------------------");
        clazz = Class.forName("net.dfzj.jvm_test.classloader.CL");
        System.out.println(clazz);
    }
}

class CL extends CLP{
    static {
        System.out.println("Class CL");
    }
}

class CLP{
    static {
        System.out.println("Class CLP");
    }
}
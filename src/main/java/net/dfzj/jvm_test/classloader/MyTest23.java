package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: 在运行期，一个Java类是由该类的完全限定名binary name（二进制名）和用于加载该类的定义类加载器（defining loader）所共同决定的。
 * 所以一个类并不仅仅由自己的完全限定名决定。
 * 如果同样名字（即相同的完全限定名）的类是由两个不同的类加载器所加载，那么这些类就是不同的，即使.class文件的字节码完全一样，并且从相同的未知加载亦如此。
 * @date 2020-08-10 16:39
 */
public class MyTest23 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        System.out.println(ClassLoader.class.getClassLoader());
    }
}
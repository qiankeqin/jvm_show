package net.dfzj.jvm_test.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-16 09:17
 */
public class MyTest14 {
    public static void main(String[] args) throws IOException {
        //获取一个上下文
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        String resourceName = "net/dfzj/jvm_test/classloader/MyTest13.class";

        Enumeration<URL> resources = classLoader.getResources(resourceName);

        while(resources.hasMoreElements()){
            URL url = resources.nextElement();
            System.out.println(url);
        }

        //--------
        System.out.println("-------1----");
        Class<?> clazz = MyTest14.class;
        System.out.println(clazz.getClassLoader());

        System.out.println("-------2----");
        Class<?> clazzS = String.class;
        System.out.println(clazzS.getClassLoader());
    }
}
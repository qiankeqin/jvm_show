package net.dfzj.jvm_test.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-13 16:29
 */
public class MyTest27 {
    public static void main(String[] args) {
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();
        while(iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println("driver :"+driver.getClass() + ", loader: " + driver.getClass().getClassLoader());
        }

        System.out.println("current context class loader: " + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器："+ServiceLoader.class.getClassLoader());
    }
}
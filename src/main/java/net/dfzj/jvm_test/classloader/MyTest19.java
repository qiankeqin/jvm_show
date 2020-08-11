package net.dfzj.jvm_test.classloader;

import com.sun.crypto.provider.AESKeyGenerator;
import net.dfzj.jvm_test.MyTest2;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-04 12:44
 */
public class MyTest19 {
    public static void main(String[] args) {
        AESKeyGenerator generator = new AESKeyGenerator();
        System.out.println(generator.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
    }
}
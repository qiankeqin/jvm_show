package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-15 13:51
 */
public class MyTest13 {

    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();


        System.out.println(classLoader);
        //循环打印父加载器
        while(null!=classLoader){
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}



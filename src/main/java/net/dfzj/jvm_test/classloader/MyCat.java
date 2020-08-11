package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-31 17:24
 */
public class MyCat {
    public MyCat() {
        System.out.println("MyCat is loaded by :"+this.getClass().getClassLoader());

        //输出MySample的Class对象，这里是指类加载器加载的MySample的Class对象
//        System.out.println("from MyCat: "+MySample.class);
    }
}
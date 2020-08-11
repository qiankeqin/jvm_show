package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-31 17:30
 */
public class MySample {

    public MySample() {
        System.out.println("MySample is loaded by :" + this.getClass().getClassLoader());

        //将MySample和MyCat产生关系
        new MyCat();

        System.out.println("from MySample: "+MyCat.class);
    }
}
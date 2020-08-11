package net.dfzj.jvm_test.classloader;

import java.io.*;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-23 09:12
 */
public class MyClass16 extends ClassLoader{
    private String classLoaderName;

    private final String fileExtension = ".class";

    private String path;

    public void setPath(String path) {
        this.path = path;
    }

    public MyClass16(String classLoaderName){
        super();//将系统类加载器当作该加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    public MyClass16(ClassLoader classLoader){
        super(classLoader);
    }

    public MyClass16(ClassLoader classLoader, String classLoaderName){
        super(classLoader);//显式指定该加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("findClass invoked:"+className);
        System.out.println("class load name:"+classLoaderName);
        byte[] bytes = loadClassData(className);
        Class<?> clazz = this.defineClass(className, bytes, 0, bytes.length);
        return clazz;
    }

    @Override
    public String toString() {
        return "MyClass16{" +
                "classLoaderName='" + classLoaderName + '\'' +
                '}';
    }

    private byte[] loadClassData(String className){
        InputStream in= null;
        byte[] data = null;
        ByteArrayOutputStream out = null;
        className = className.replace(".", "/");
        try{
            //更换文件名,.改为/
            this.classLoaderName = this.classLoaderName.replace(".", "/");
            in = new FileInputStream(new File(this.path + className + this.fileExtension));
            out = new ByteArrayOutputStream();
            int ch = 0;
            while(-1!=(ch = in.read())){
                out.write(ch);
            }
            data = out.toByteArray();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try{
                in.close();
                out.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return data;
    }

    public static void test(ClassLoader classLoader) throws Exception {
        Class<?> myTest2 = classLoader.loadClass("net.dfzj.jvm_test.MyTest2");
        Object instance = myTest2.newInstance();
        System.out.println(instance);
        System.out.println(instance.getClass().getClassLoader());
    }

    public static void main(String[] args) throws Exception {
        MyClass16 loader1 = new MyClass16("loader1");
        loader1.setPath("/Users/qiankeqin/Documents/develop/sourcecode/test_class/");
        Class<?> clazz = loader1.loadClass("net.dfzj.jvm_test.MyTest2");
        System.out.println("clazz="+clazz.hashCode());
        Object instance = clazz.newInstance();
        System.out.println(instance);

        loader1 = null;
        clazz = null;
        instance = null;
        System.gc();//显式调用垃圾回收

        //Thread.sleep(200000);

        loader1 = new MyClass16("loader1");
        loader1.setPath("/Users/qiankeqin/Documents/develop/sourcecode/test_class/");
        clazz = loader1.loadClass("net.dfzj.jvm_test.MyTest2");
        System.out.println("clazz="+clazz.hashCode());
        instance = clazz.newInstance();
        System.out.println(instance);
//        MyClass16 loader2 = new MyClass16(loader1,"loader2");
//        loader2.setPath("/Users/qiankeqin/Documents/develop/sourcecode/test_class/");
//        Class<?> clazz2 = loader2.loadClass("net.dfzj.jvm_test.MyTest2");
//        System.out.println("clazz2="+clazz2.hashCode());
//        Object instance2 = clazz2.newInstance();
//        System.out.println(instance2);
//
//        MyClass16 loader3 = new MyClass16(loader2,"loader3");
//        loader3.setPath("/Users/qiankeqin/Documents/develop/sourcecode/test_class/");
//        Class<?> clazz3 = loader3.loadClass("net.dfzj.jvm_test.MyTest2");
//        System.out.println("clazz3="+clazz3.hashCode());
//        Object instance3 = clazz3.newInstance();
//        System.out.println(instance3);

        System.out.println();
    }
}
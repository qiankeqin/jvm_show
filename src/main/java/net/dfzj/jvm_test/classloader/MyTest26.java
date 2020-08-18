package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-08-13 16:11
 */
public class MyTest26 implements Runnable{
    private Thread thread;

    public MyTest26(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader cl = this.thread.getContextClassLoader();

        this.thread.setContextClassLoader(cl);

        System.out.println("Class:" + cl.getClass());
        System.out.println("Parent:" + cl.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest26();
    }
}
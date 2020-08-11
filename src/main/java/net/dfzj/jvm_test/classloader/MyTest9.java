package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-15 08:48
 */
public class MyTest9 {
    static {
        //0
        System.out.println("MyTest9 static block");
    }

    public static void main(String[] args) {
        //3
        System.out.println(Child9.b);
    }
}

class Parent9{
    static int a = 1;

    static {
        //1
        System.out.println("Parent9 static block");
    }
}

class Child9 extends Parent9{
    static int b = 3;

    static {
        //2
        System.out.println("Child9 static block");
    }
}
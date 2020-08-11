package net.dfzj.jvm_test.classloader;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-15 08:59
 */
public class MyTest10 {
    static {
        //1
        System.out.println("MyTest10 static block");
    }
    public static void main(String[] args) {
        Parent10 parent10 ;

        //2
        System.out.println("-------");

        parent10 = new Parent10();

        //4
        System.out.println("--------------");

        Child10 child10;

        //5
        System.out.println("--------");

        //6
        System.out.println(parent10.a);

        //7
        System.out.println("---------------");

        //9
        System.out.println(Child10.b);
    }
}

class Parent10{
    int a = 3;

    static {
        //3
        System.out.println("Parent10 static block");
    }
}

class Child10 extends Parent10{
    static int b = 4;

    static {
        //8
        System.out.println("Child10 static block");
    }
}

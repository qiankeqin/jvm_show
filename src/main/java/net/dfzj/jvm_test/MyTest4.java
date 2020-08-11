package net.dfzj.jvm_test;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-09 08:56
 */
public class MyTest4 {
    public static void main(String[] args) {
        MyParent4[] myParent4s = new MyParent4[1];
        System.out.println(myParent4s.getClass());
        MyParent4[][] myParent4s2 = new MyParent4[1][];
        System.out.println(myParent4s2.getClass());
        int[] i = new int[1];
        System.out.println(i.getClass());
        System.out.println(i.getClass().getSuperclass());
    }
}

class MyParent4{
    static{
        System.out.println("MyParent4 static block");
    }
}
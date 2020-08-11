package net.dfzj.jvm_test;

import java.util.UUID;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-07-09 08:43
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}

class MyParent3 {
    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("MyParent3 static block");
    }
}
package com.codeblock;

public class codeblockStatic1 {
    public static int a = returnOne();
//    只能调用returnOne1
    public static int returnOne(){
        return 1;
    }
    public  int returnOne1(){
        return 1;
    }
    static {
        System.out.println("static调用一次");
    }
}

package com.codeblock;

public class codeblockStatic {
    public static int a = 3;
    static{
        System.out.println("static调用一次");
    }
    {
        System.out.println("非static调用一次");
    }
}

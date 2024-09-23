package com.codeblock;

public class codeblockMain {
    public static void main(String[] args) {
        codeblockStatic s = new codeblockStatic();
        codeblockStatic sq = new codeblockStatic();
        int a = codeblockStatic.a;
        System.out.println(codeblockStatic.a);


//        int a2 = codeblockStatic1.a;
        codeblockStatic1 c = new codeblockStatic1();
    }

//    static仅调用一次
//    非static调用两次只有创建实例的时候会调用
}

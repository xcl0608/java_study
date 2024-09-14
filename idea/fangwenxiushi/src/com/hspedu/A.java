package com.hspedu;

public class A {
    public int a;
    protected int b;
    int c;
    private  int d;
    public void say(){
        System.out.println("A = "+a+" B = "+b+" C = "+c+" D = "+d);
    }

    public A(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}

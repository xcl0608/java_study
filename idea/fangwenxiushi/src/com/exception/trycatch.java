package com.exception;

public class trycatch {
    public static void main(String[] args) {
        try{
            int n1= 100;
            int n2 = 0;
            System.out.println(n1/n2);
            Person p = new Person();
            p = null;
            System.out.println(p.name);
        }catch(NullPointerException e){
            System.out.println("控指针错误="+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("算数异常 = "+e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
class Person{
    String name = "xyz";
}

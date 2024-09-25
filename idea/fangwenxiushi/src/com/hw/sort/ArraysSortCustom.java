package com.hw.sort;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        Integer arr[] = {-1,-2,1,3};
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int l1 = (Integer) o1;
                int l2 = (Integer) o2;
                return l1-l2;
            }
        });
        for (int j = 0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        Books[] books = new Books[4];
        books[0] = new Books("d",3);
        books[1] = new Books("dd",2);
        books[2] = new Books("dddd",1);
        books[3] = new Books("ddd",4);

        bubble02(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Books b1 = (Books) o1;
                Books b2 = (Books) o2;
                int n1 = b1.getName().length();
                int n2 = b2.getName().length();
                int pr1 = b1.getPrices();
                int pr2 = b2.getPrices();
                return n1-n2;
            }
        });
        System.out.println(books[0].getName());
        System.out.println(books[1].getName());
        System.out.println(books[2].getName());
        System.out.println(books[3].getName());
//        books[0].toString1();
//        books[1].toString1();
//        books[2].toString1();
//        books[3].toString1();
        System.out.println(Arrays.toString(books));

    }


    public static void  bubble02(Object [] arr, Comparator c){
        Object temp;
        for(int i =0 ;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(c.compare(arr[j],arr[j+1])>0){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
    public static void  bubble01(int[] arr){
        int temp;
        for(int i =0 ;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
}


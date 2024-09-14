import xc.Dog;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Mytool mt = new Mytool();
        int []arr1 = {1,3,2,5,4};
         mt.bubble(arr1);
        for (int j : arr1) {
            System.out.println(j);
//            System.out.println();
        }
        Dog dog = new Dog();
        dog.print();
//        Arrays
    }
}
class Mytool{
    public void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
package day2;


import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5};
        for (int i =1;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("**********************************");
        for (int i=arr.length;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

package day2;

import java.util.Scanner;

public class DemoPlaindromeNUmber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your String");
        String str= sc.next();
        String rev="";
        String org_str=str;
        int len=str.length();
        for (int i=len-1;i>=0;i--){
        rev=rev+str.charAt(i);
        System.out.println(rev);
        }
        if (org_str.equals(rev)) {

            System.out.println(org_str+"is palindrome string");

        }else {
            System.out.println(org_str+"Not a palindrome String");
        }
    }
}

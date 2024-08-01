package day2;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <String>a=new ArrayList<String>();
        a.add("Teju");
        a.add("Java");
        a.add("Automation");
        System.out.println(a);
        a.add(0,"Selenium");
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
       System.out.println( a.get(2));
        System.out.println(a.contains("Java"));
        System.out.println(a.indexOf("Selenium"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
    }
}

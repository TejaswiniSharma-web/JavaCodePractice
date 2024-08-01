package day2;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<String>();
        hs.add("Teju");
        hs.add("Aravind");
        hs.add("India");
        hs.add("India");
       System.out.println(hs.isEmpty());
       System.out.println(hs.remove("Aravind"));
       System.out.println(hs.size());
        System.out.println(hs);

    }
}

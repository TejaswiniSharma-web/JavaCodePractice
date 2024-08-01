package day2;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        HashSet<String> hd=new HashSet<>();
        hd.add("Teju");
        hd.add("Aravind");
        hd.add("AAdvik");
        hd.add("Raj");
        Iterator<String>j=hd.iterator();
        
        for (int i =0;i<hd.size();i++){
            System.out.println(j.next());
        }

    }
}

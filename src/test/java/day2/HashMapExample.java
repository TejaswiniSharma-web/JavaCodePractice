package day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(0,"Teju");
        hm.put(1,"Aravind");
        hm.put(2,"AAdvik");
        hm.put(3,"Aravind");
       System.out.println(hm.get(2));
      System.out.println(hm.remove(3));
        Set sn=hm.entrySet();
        Iterator<String>it= sn.iterator();
        while (it.hasNext()){
        }

    }
}

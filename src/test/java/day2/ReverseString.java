package day2;

public class ReverseString {

    public static void main(String[] args) {
        String s="Teju";
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
}
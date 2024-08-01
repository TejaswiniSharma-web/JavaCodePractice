package day2;

public class StringDemo {
    public static void main(String[] args) {
        String str = "this is javatpoint";
        String rev = "";
        int len = str.length();
        str.charAt(0);

        for (int i = len - 1; i >= 0; i--) {
            str.charAt(i);
            rev = rev + str.charAt(i);
            System.out.println("Reverse string is :"+rev);
        }
    }
}

package day3;

public class ReverseNName {
    public static void main(String[] args) {
       String name="Tejaswini";

        for(int i =name.length()-1; i>=0;i-- ){
            System.out.print(name.charAt(i));
        }

    }
}

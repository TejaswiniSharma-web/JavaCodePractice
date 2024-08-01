package day2;

import java.util.Scanner;

public class CaptilizeEachLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Statemenrt");
      String org_stmnt=  sc.nextLine();
       String[]words= org_stmnt.split(" ");
            for (String word:words){
                char[]ca=word.toCharArray();
              char c=  ca[0];
              String firstchar=String.valueOf(c);
              String captialsizedword=firstchar;
              for(int i=1;i>ca.length;i++){
                  captialsizedword  =captialsizedword+ca[i];

              }
            }
    }
}
